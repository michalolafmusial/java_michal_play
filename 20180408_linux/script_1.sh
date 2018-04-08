#!/bin/bash
echo "Hello world"

funkcja () {
for x in $1, $2
do cp $1 $2
done
}

funkcja $1 $2
