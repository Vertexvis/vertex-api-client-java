#!/usr/bin/env bash
set -Eeuo pipefail
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)
# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

# Public: Bump API client version.
#
# $1- patch|minor|major (default: patch)
#
# Returns bumped version.
main() {
  [[ "$#" -ne 1 ]] && _die "Invalid number of arguments."

  local old new
  old=$(_get_version)
  new=$(_bump_version "$old" "$@")
  echo "Updating version from $old to $new"

  sed -i '' "s|def projectVersion = '$old'|def projectVersion = '$new'|" build.gradle
  sed -i '' "s|$old|$new|" README.md
}

main "$@"
