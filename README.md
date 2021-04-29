# Vertex API Client for Java

If you're ready to integrate Vertex into your application, this is the place! For more background on the Vertex platform, start with [our guides](https://developer.vertexvis.com/docs/guides).

The Vertex platform API client for Java is generated using [`openapi-generator`](https://github.com/OpenAPITools/openapi-generator), so it's always up-to-date.

The client can be used with Java 1.8+ and pulled into Maven or Gradle projects.

## Installation

### Maven users

```xml
<dependency>
  <groupId>com.vertexvis</groupId>
  <artifactId>vertex-api-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

```groovy
compile "com.vertexvis:vertex-api-client:0.1.0"
```

### Others

First, generate the JAR.

```shell
mvn clean package
```

Then manually install the following JARs.

- `target/vertex-api-client-0.1.0.jar`
- `target/lib/*.jar`

## Usage

Follow the [installation](#installation) instruction. Then, execute [Example.java](./src/main/java/com/vertexvis/Example.java).
