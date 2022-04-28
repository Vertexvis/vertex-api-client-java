package com.vertexvis.model;

import java.util.Optional;

/**
 * Manually created class
 */
public class OneOfCADExportConfig {
    private final CADExportConfig cadExportConfig;

    public OneOfCADExportConfig(CADExportConfig cadExportConfig) {
        this.cadExportConfig = cadExportConfig;
    }

    public boolean hasCADExportConfig() {
        return cadExportConfig != null;
    }

    public Optional<CADExportConfig> getCADExportConfig() {
        return Optional.ofNullable(cadExportConfig);
    }
}
