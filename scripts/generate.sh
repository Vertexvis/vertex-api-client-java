#!/usr/bin/env bash
set -o errexit -o nounset

FILES=(AnyOfCameraCameraFit.java AnyOfChangeVisibilityOperationChangeMaterialOperationClearMaterialOperationChangeTransformOperationClearTransformOperationSelectOperationDeselectOperation.java AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship.java AnyOfQueryByIdQueryByCollectionQueryAll.java OneOfHitResultDataSceneItemDataPartRevisionData.java)

for f in "${FILES[@]}"; do
  mv "src/main/java/com/vertexvis/model/$f" . || true
done

rm -rf api docs gradle src

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli:latest generate \
  --input-spec https://platform.vertexvis.com/spec \
  --generator-name java \
  --config /local/config.yml \
  --output /local

for f in "${FILES[@]}"; do
  mv "$f" ./src/main/java/com/vertexvis/model
done
