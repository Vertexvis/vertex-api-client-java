# Vertex API Client Java - Multi-Module Project

This project has been restructured as a multi-module Gradle project with the following modules:

## Modules

### 1. `openapi-generator-plugin`
Custom Gradle plugin for generating Vertex API client code using OpenAPI Generator.

**Location**: `openapi-generator-plugin/`

**Purpose**: 
- Contains custom OpenAPI code generation logic
- Provides a reusable Gradle plugin for generating the API client
- Includes any custom templates or generators specific to Vertex API

**Build**: 
```bash
./gradlew :openapi-generator-plugin:build
./gradlew :openapi-generator-plugin:publishToMavenLocal
```

### 2. `api-client-library`
The main API client library generated from the OpenAPI specification.

**Location**: `api-client-library/`

**Purpose**:
- Contains the generated API client code
- Includes authentication utilities
- Provides the core SDK functionality

**Build**:
```bash
./gradlew :api-client-library:build
```

**Generate API Client**:
```bash
./gradlew :api-client-library:openApiGenerate
```

### 3. `examples`
Example applications demonstrating how to use the API client library.

**Location**: `examples/`

**Purpose**:
- Contains example code showing API usage
- Includes command-line utilities for common operations
- Demonstrates best practices for using the API client

**Run Examples**:
```bash
./gradlew :examples:run
./gradlew :examples:runCreateAssemblyExample
./gradlew :examples:listExamples
```

## Build Order

The modules have dependencies on each other and should be built in this order:

1. `openapi-generator-plugin` (standalone)
2. `api-client-library` (uses the plugin)
3. `examples` (depends on the library)

## Building the Entire Project

To build all modules:
```bash
./gradlew build
```

To clean and rebuild everything:
```bash
./gradlew clean build
```

## Publishing

The library can be published to Maven repositories:
```bash
./gradlew :api-client-library:publishToMavenLocal
./gradlew publish
```

## Development Workflow

1. Make changes to the OpenAPI generator plugin if needed
2. Build and publish the plugin locally: `./gradlew :openapi-generator-plugin:publishToMavenLocal`
3. Regenerate the API client: `./gradlew :api-client-library:openApiGenerate`
4. Build the library: `./gradlew :api-client-library:build`
5. Test with examples: `./gradlew :examples:run`

## Migration Notes

This project was converted from a single-module to a multi-module structure:

- **Original structure**: All code in `src/main/java/com/vertexvis/`
- **New structure**: 
  - Code generation logic → `openapi-generator-plugin/`
  - Core API client → `api-client-library/`
  - Examples → `examples/`

The functionality remains the same, but the code is now better organized and the generator can be reused across projects.
