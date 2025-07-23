# Vertex API Client for Java

[![Version](https://img.shields.io/maven-central/v/com.vertexvis/api-client-java)](https://search.maven.org/artifact/com.vertexvis/api-client-java)
[![MIT License](https://img.shields.io/github/license/vertexvis/vertex-api-client-java)](https://github.com/Vertexvis/vertex-api-client-java/blob/main/LICENSE)

If you're ready to integrate Vertex into your application, this is the place! For more background on the Vertex platform, start with our [Developer Portal](https://developer.vertexvis.com/).

The Vertex REST API client for Java is generated using [`openapi-generator`](https://github.com/OpenAPITools/openapi-generator), so it's always up-to-date.

The client can be used with Java 1.8+ and pulled into Maven or Gradle projects.

## Installation

### Maven

```xml
<dependency>
  <groupId>com.vertexvis</groupId>
  <artifactId>api-client-java</artifactId>
  <version>0.10.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

```groovy
compile "com.vertexvis:api-client-java:0.10.0"
```

### Sbt

```sbt
libraryDependencies += "com.vertexvis" % "api-client-java" % "0.10.0"
```

### Others

First, generate the JAR.

```shell
mvn clean package
```

Then manually install the following JARs.

- `target/api-client-java-0.10.0.jar`
- `target/lib/*.jar`

## Usage

If you're not an existing Vertex customer, [sign up for a free account](https://aws.amazon.com/marketplace/pp/B08PP264Z1?stl=true).

Export your credentials.

```bash
# Export your Vertex REST API client ID and secret
export VERTEX_CLIENT_ID=[YOUR_CLIENT_ID]
export VERTEX_CLIENT_SECRET=[YOUR_CLIENT_SECRET]
```

Then, check out our [sample applications](./src/main/java/com/vertexvis/example).

## Local Development

This project uses a multi-module Gradle structure. For detailed information about the modules and their purposes, refer to the [Multi-Module README](./MULTI_MODULE_README.md).

### Build Order

1. Build the OpenAPI Generator Plugin:
```bash
./gradlew :openapi-generator-plugin:build
./gradlew :openapi-generator-plugin:publishToMavenLocal
```

2. Generate the API Client:
```bash
./gradlew :api-client-library:openApiGenerate
```

3. Build the API Client Library:
```bash
./gradlew :api-client-library:build
```

4. Run Example Applications:
```bash
./gradlew :examples:run
./gradlew :examples:listExamples
```

### Building the Entire Project

To build all modules:
```bash
./gradlew build
```

### Versioning

To bump the version of all modules:
```bash
./scripts/bump-version.sh [patch|minor|major]
```

### Publishing

To publish to Maven Local:
```bash
./gradlew :api-client-library:publishToMavenLocal
```

To publish to Maven Central:
```bash
./gradlew publish
```
