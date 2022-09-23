#!/bin/bash
echo "What are you trying to figure out?"
read n;
f=1;

while [ $n -gt 1 ];
do
    f=$(($f * $n));
    n=$(($n - 1))
done

echo "$f"