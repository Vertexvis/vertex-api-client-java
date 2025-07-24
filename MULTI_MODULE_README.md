# Vertex API Client Java - Project Architecture

This project uses a modern Gradle multi-module structure with convention plugins for clean, maintainable builds.

## Project Structure

### Core Modules

#### `api-client-library/`
The main API client library generated from the OpenAPI specification.

**Purpose**:
- Contains the generated API client code
- Includes authentication utilities and models
- Provides the core SDK functionality that gets published to Maven Central

#### `examples/`
Example applications demonstrating how to use the API client library.

**Purpose**:
- Contains example code showing API usage patterns
- Includes command-line utilities for common operations
- Demonstrates best practices for authentication and API calls

**Run Examples**:
```bash
./gradlew :examples:run
./gradlew :examples:runCreateAssemblyExample
./gradlew :examples:listExamples
```

### Build Infrastructure

#### `buildSrc/`
Contains the build logic and custom OpenAPI generator.

**Purpose**:
- Houses convention plugins (`vertex.java-conventions`, `vertex.openapi-generator`)
- Contains the custom `VertexJavaClientCodegen` generator
- Provides shared build configuration across all modules
- Eliminates circular dependencies and external plugin publishing

**Key Files**:
- `src/main/java/com/vertexvis/codegen/VertexJavaClientCodegen.java` - Custom OpenAPI generator
- `src/main/groovy/vertex.java-conventions.gradle` - Common Java build settings
- `src/main/groovy/vertex.openapi-generator.gradle` - OpenAPI generation configuration

## Architecture Benefits

### Convention Plugins
- **Self-contained**: No need to publish plugins separately
- **Consistent**: Shared configuration across all modules
- **Maintainable**: Build logic lives with the code it serves

### Simplified Dependencies
- **No circular dependencies**: buildSrc → modules (not modules → plugins → modules)
- **Faster builds**: No separate plugin build/publish cycle
- **Easier development**: Make changes and build immediately

## Development Workflow

The build is completely self-contained:

```bash
# Everything needed is built automatically
./gradlew build

# Test examples
./gradlew :examples:run

# Publish locally for testing
./gradlew :api-client-library:publishToMavenLocal
```

