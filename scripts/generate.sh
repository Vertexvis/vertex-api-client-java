#!/usr/bin/env bash
set -Eeuo pipefail
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)
# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

main() {
  mv "src/test" . || true

  rm -rf api gradle src

  docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli:v7.11.0 generate \
    --input-spec https://platform.vertexvis.com/spec \
    --generator-name java \
    --config /local/config.yml \
    --output /local

  mv ./test ./src

  local version
  version=$(_get_version)
  sed -i "" "s|OpenAPI-Generator/1.0/java|vertex-api-client-java/$version|" src/main/java/com/vertexvis/ApiClient.java
}

main "$@"
