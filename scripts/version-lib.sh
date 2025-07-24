#!/usr/bin/env bash

NAT='0|[1-9][0-9]*'
ALPHANUM='[0-9]*[A-Za-z-][0-9A-Za-z-]*'
IDENT="$NAT|$ALPHANUM"
FIELD='[0-9A-Za-z-]+'
SEMVER_REGEX="\
^[vV]?\
($NAT)\\.($NAT)\\.($NAT)\
(\\-(${IDENT})(\\.(${IDENT}))*)?\
(\\+${FIELD}(\\.${FIELD})*)?$"

_bump() {
  local new;

  if [[ "$1" =~ $SEMVER_REGEX ]]; then
      local major=${BASH_REMATCH[1]}
      local minor=${BASH_REMATCH[2]}
      local patch=${BASH_REMATCH[3]}

      case "$2" in
        major) new="$((major + 1)).0.0";;
        minor) new="${major}.$((minor + 1)).0";;
        patch) new="${major}.${minor}.$((patch + 1))";;
        *) _die "Invalid command $1.";;
      esac

      echo "$new"
  else
    _die "Version $1 does not match the semver scheme 'X.Y.Z'."
  fi
}

# Internal: Print message to stderr and exit.
#
# $1 - Message to log prior to exiting.
# $2 - Exit code (default: 1)
#
# Returns nothing.
_die() {
  echo "$1"
  exit "${2-1}"
}

# Internal: Get API client version.
#
# Returns version.
_get_version() {
  local prefix="def projectVersion = "
  grep "$prefix" build.gradle | sed "s/$prefix//" | tr -d "'"
}

# Internal: Bump API client version.
#
# $1- existing version
# $2- patch|minor|major (default: patch)
#
# Returns bumped version.
_bump_version() {
  version=$(_bump "$1" "$2")
  echo "$version"
}
