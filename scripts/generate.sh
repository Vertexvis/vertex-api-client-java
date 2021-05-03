#!/usr/bin/env bash
set -Eeuo pipefail
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)

# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

main() {
  local root=(Example.java)
  local auth=(RetryingOAuth.java)
  local models=(AnyOfCameraCameraFit.java AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation.java AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship.java AnyOfQueryByIdQueryByCollectionQueryAll.java OneOfHitResultDataSceneItemDataPartRevisionData.java)
  for f in "${root[@]}"; do mv "src/main/java/com/vertexvis/$f" . || true; done
  for f in "${auth[@]}"; do mv "src/main/java/com/vertexvis/auth/$f" . || true; done
  for f in "${models[@]}"; do mv "src/main/java/com/vertexvis/model/$f" . || true; done

  rm -rf api docs gradle src

  docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli:latest generate \
    --input-spec https://platform.vertexvis.com/spec \
    --generator-name java \
    --config /local/config.yml \
    --output /local

  for f in "${root[@]}"; do mv "$f" ./src/main/java/com/vertexvis; done
  for f in "${auth[@]}"; do mv "$f" ./src/main/java/com/vertexvis/auth; done
  for f in "${models[@]}"; do mv "$f" ./src/main/java/com/vertexvis/model; done

  local version
  version=$(_get_version)
  sed -i "" "s|OpenAPI-Generator/$version/java|vertex-api-client-java/$version|" src/main/java/com/vertexvis/ApiClient.java
}

main "$@"
