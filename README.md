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
  <version>0.16.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

```groovy
compile "com.vertexvis:api-client-java:0.16.0"
```

### Sbt

```sbt
libraryDependencies += "com.vertexvis" % "api-client-java" % "0.16.0"
```

### Others

First, generate the JAR.

```shell
mvn clean package
```

Then manually install the following JARs.

- `target/api-client-java-0.16.0.jar`
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

This project uses a multi-module Gradle structure with convention plugins. For detailed information about the modules and their purposes, refer to the [Multi-Module README](./MULTI_MODULE_README.md).

### Quick Start

The project now uses convention plugins in `buildSrc/` which makes the build completely self-contained:

```bash
# Build everything (no separate plugin publishing needed)
./gradlew build

# Run example applications
./gradlew :examples:run
./gradlew :examples:listExamples
```

### Development Workflow

1. **Make changes** to the API client or custom generator
2. **Build and test** with `./gradlew build`
3. **Test locally** with `./gradlew :api-client-library:publishToMavenLocal`

### Using Snapshot Versions

To consume published snapshot versions in other projects, add the snapshot repository to your build configuration:

#### Maven

```xml
<repositories>
  <repository>
    <id>central-snapshots</id>
    <url>https://central.sonatype.com/repository/maven-snapshots/</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>

<dependency>
  <groupId>com.vertexvis</groupId>
  <artifactId>api-client-java</artifactId>
  <version>0.16.0-SNAPSHOT</version>
</dependency>
```

#### Gradle

```groovy
repositories {
    mavenCentral()
    maven {
        url 'https://central.sonatype.com/repository/maven-snapshots/'
    }
}

dependencies {
    implementation 'com.vertexvis:api-client-java:0.16.0-SNAPSHOT'
}
```

### Versioning

To bump the version of all modules:
```bash
./scripts/bump-version.sh [patch|minor|major]
```

### Publishing

To publish to Maven Local for testing:
```bash
./gradlew :api-client-library:publishToMavenLocal
```

Snapshots are automatically published to Maven Central on pushes to the `main` branch. Releases are created when a new version tag is pushed.
