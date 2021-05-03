#!/usr/bin/env bash
set -Eeuo pipefail
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)

# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

# set -x

# Public: Bump API client version in config.yml.
#
# $1- patch|minor|major (default: patch)
#
# Returns bumped version.
main() {
  [[ "$#" -ne 1 ]] && _die "Invalid number of arguments."

  local old new
  old=$(_get_version)
  new=$(_bump_version "$old" "$@")
  echo "Updating config.yml's artifactVersion from $old to $new"
  sed -i "" "s|artifactVersion: $old|artifactVersion: $new|" config.yml
}

main "$@"
