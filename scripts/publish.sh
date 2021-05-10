#!/usr/bin/env bash
set -o errexit
scripts_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd -P)
# shellcheck source=./version-lib.sh
source "$scripts_dir/version-lib.sh"

version="v$(_get_version)"
sha="$(git rev-parse HEAD)"

curl -s -X POST "https://api.github.com/repos/$REPOSITORY/releases" \
-H "Authorization: token $GITHUB_TOKEN" \
-d @- <<EOF
{
  "tag_name": "$version",
  "target_commitish": "$sha",
  "name": "$version",
  "body": "Automated release for $version\n",
  "draft": false,
  "prelease": false
}
EOF
