#!/usr/bin/env bash
set -Eeuo pipefail
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)
# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

main() {
  local root=(JSON.java example)
  local auth=(RetryingOAuth.java)
  local models=(serialization AnyOfCameraCameraFit.java AnyOfCreateSceneItemRequestData.java AnyOfRelationshipDataApiError.java AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation.java AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship.java AnyOfQueryByIdQueryByCollectionQueryAll.java OneOfHitResultDataSceneItemDataPartRevisionData.java OneOfSceneViewRelationshipSceneViewStateRelationship.java AnyOfGeometrySetRelationshipPartRevisionRelationship.java)
  mv "src/test" . || true
  for f in "${root[@]}"; do mv "src/main/java/com/vertexvis/$f" . || true; done
  for f in "${auth[@]}"; do mv "src/main/java/com/vertexvis/auth/$f" . || true; done
  for f in "${models[@]}"; do mv "src/main/java/com/vertexvis/model/$f" . || true; done

  rm -rf api gradle src
  
  docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli:v5.2.1 generate \
    --input-spec https://platform.vertexvis.com/spec \
    --generator-name java \
    --config /local/config.yml \
    --output /local

  mv ./test ./src
  for f in "${root[@]}"; do mv "$f" ./src/main/java/com/vertexvis; done
  for f in "${auth[@]}"; do mv "$f" ./src/main/java/com/vertexvis/auth; done
  for f in "${models[@]}"; do mv "$f" ./src/main/java/com/vertexvis/model; done

  local version
  version=$(_get_version)
  sed -i "" "s|OpenAPI-Generator/1.0/java|vertex-api-client-java/$version|" src/main/java/com/vertexvis/ApiClient.java
}

main "$@"
