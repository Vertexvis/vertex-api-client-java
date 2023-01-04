package com.vertexvis.example.cmdline;

import picocli.CommandLine;

import java.util.List;
import java.util.UUID;

@CommandLine.Command(mixinStandardHelpOptions = true)
public abstract class CommandLineOptions implements Runnable {
    @CommandLine.Spec
    CommandLine.Model.CommandSpec spec;

    public List<String> getPartFiles() {
        return partFiles;
    }

    public String getAssemblyName() {
        return assemblyName;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getVertexApiUrl() {
        return vertexApiUrl;
    }

    public boolean isVerboseDebugLogging() {
        return verboseDebugLogging;
    }

    public CommandLine.Model.CommandSpec getSpec() {
        return spec;
    }

    @CommandLine.Parameters(arity = "1..*", description = "Specify CAD files separated by '${sys:path.separator}'" +
            " to create part revisions from.",
            split = "${sys:path.separator}")
    private List<String> partFiles;
    @CommandLine.Option(names = {"-n"}, description = "Name of the assembly to create from the parts")
    private String assemblyName = "assembly-from-parts" + UUID.randomUUID().toString();

    @CommandLine.Option(names = {"-i", "--clientId"}, description = "Vertex API client id", defaultValue = "${env:VERTEX_CLIENT_ID}")
    private String clientId;
    @CommandLine.Option(names = {"-s", "--clientSecret"}, description = "Vertex API client secret", defaultValue = "${env:VERTEX_CLIENT_SECRET}")
    private String clientSecret;

    @CommandLine.Option(names = {"-e", "--env"}, description = "Vertex API endpoint. Defaults to https://platform.vertexvis.com")
    private String vertexApiUrl = "https://platform.vertexvis.com";

    @CommandLine.Option(names = {"-v", "--verbose"}, description = "Turn on debug logging")
    private boolean verboseDebugLogging;
}
