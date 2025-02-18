#!/usr/bin/env sh
echo ""
echo "SHELL ARGUMENTS:::"
echo "ALL: $@"
echo "FOR custom response: $2"
echo ":::SHELL ARGUMENTS"
echo ""
exec java -jar app.jar --custom.response=$2