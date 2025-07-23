package com.vertexvis.codegen;

import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.languages.JavaClientCodegen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.model.ModelsMap;
import org.openapitools.codegen.model.ModelMap;
import io.swagger.v3.oas.models.media.Schema;
import java.util.*;

/**
 * Custom Java client codegen that supports conditional validation skipping.
 */
public class VertexJavaClientCodegen extends JavaClientCodegen  implements CodegenConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(VertexJavaClientCodegen.class);
    
    /** Configuration option key for specifying models to skip validation for. */
    public static final String SKIP_VALIDATION_FOR = "skipValidationFor";
    /** Vendor extension key used to mark models that should skip validation. */
    public static final String X_SKIP_VALIDATION = "x-skip-validation";
    
    private Set<String> skipValidationModels = new HashSet<>();

    /**
     * Default constructor that sets up the custom CLI options.
     */
    public VertexJavaClientCodegen() {
        super();
        
        // Add custom CLI option
        cliOptions.add(org.openapitools.codegen.CliOption.newString(SKIP_VALIDATION_FOR, 
            "Comma-separated list of model class names to skip validation for (e.g., Scene,SceneMetadata)"));
    }

    @Override
    public String getName() {
        return "vertex-java";
    }

    @Override
    public String getHelp() {
        return "Generates a Vertex-customized Java client library.";
    }

    @Override
    public void processOpts() {
        super.processOpts();
        
        // Parse the skipValidationFor option
        if (additionalProperties.containsKey(SKIP_VALIDATION_FOR)) {
            String skipValidationForValue = (String) additionalProperties.get(SKIP_VALIDATION_FOR);
            if (skipValidationForValue != null && !skipValidationForValue.trim().isEmpty()) {
                String[] modelNames = skipValidationForValue.split(",");
                for (String modelName : modelNames) {
                    skipValidationModels.add(modelName.trim());
                }
                LOGGER.info("Models to skip validation: {}", skipValidationModels);
            }
        }
    }

    @Override
    public CodegenModel fromModel(String name, Schema schema) {
        CodegenModel model = super.fromModel(name, schema);
        
        // Check if this model should skip validation
        if (skipValidationModels.contains(model.classname)) {
            LOGGER.info("Adding skip validation extension for model: {}", model.classname);
            model.vendorExtensions.put(X_SKIP_VALIDATION, true);
        }
        
        return model;
    }

    @Override
    public ModelsMap postProcessModels(ModelsMap objs) {
        var result = super.postProcessModels(objs);
        
        // Additional processing can be done here if needed
        @SuppressWarnings("unchecked")
        List<ModelMap> models = (List<ModelMap>) objs.get("models");
        
        if (models != null) {
            for (ModelMap modelMap : models) {
                CodegenModel model = modelMap.getModel();
                
                if (model.vendorExtensions.containsKey(X_SKIP_VALIDATION)) {
                    LOGGER.debug("Model {} will skip validation", model.classname);
                }
            }
        }
        
        return result;
    }
}
