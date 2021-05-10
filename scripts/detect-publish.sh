#!/usr/bin/env bash
set -e
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)
# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

version=v$(_get_version)

git fetch --tags

if test -z "$(git tag --list "$version")"; then echo 1; else echo 0; fi
