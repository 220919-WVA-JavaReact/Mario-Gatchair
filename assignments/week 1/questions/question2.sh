#!/bin/bash
# I decided I'm going to have it take the user input for fibonacci sequence expecting 100 as the end
echo "How far are we going?"
read n;
a=0;
b=1;
c=2;
echo "$a";
echo "$b";
until [ $c -gt $n ];
do
    c=$(($c + $b));
    d=$(($a + $b));
    echo "$d";
    a=$b;
    b=$d;
done