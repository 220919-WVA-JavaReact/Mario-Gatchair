#!/bin/bash
# I decided I'm going to have it take the user input for fibonacci sequence expecting 100 as the end
echo "How far are we going?"
read n;
#this is the first number in the squenance
a=0;
#this is the second number in the sequnace
b=1;
#this is the allows the program to increment
c=2;
echo "$a";
echo "$b";
until [ $c -gt $n ];
#used until so that it as it sounds until the number in the sequence becomes greater the input
do
    c=$(($c + $b));
    d=$(($a + $b));
    echo "$d";
    a=$b;
    b=$d;
done