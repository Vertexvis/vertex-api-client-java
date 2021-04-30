#!/usr/bin/env bash
set -o errexit -o nounset

get_version() {
  grep "version = " build.gradle | tr -d "version = " | tr -d "'"
}

main() {
  local files=(Example.java RemoveContentTypeCharsetInterceptor.java)
  local models=(AnyOfCameraCameraFit.java AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation.java AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship.java AnyOfQueryByIdQueryByCollectionQueryAll.java OneOfHitResultDataSceneItemDataPartRevisionData.java)
  for f in "${files[@]}"; do mv "src/main/java/com/vertexvis/$f" . || true; done
  for f in "${models[@]}"; do mv "src/main/java/com/vertexvis/model/$f" . || true; done

  rm -rf api docs gradle src

  docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli:latest generate \
    --input-spec https://platform.vertexvis.com/spec \
    --generator-name java \
    --config /local/config.yml \
    --output /local

  for f in "${files[@]}"; do mv "$f" ./src/main/java/com/vertexvis; done
  for f in "${models[@]}"; do mv "$f" ./src/main/java/com/vertexvis/model; done

  local version
  version=$(get_version)
  sed -i "" "s|OpenAPI-Generator/$version/java|vertex-api-client-java/$version|" src/main/java/com/vertexvis/ApiClient.java
}

main
