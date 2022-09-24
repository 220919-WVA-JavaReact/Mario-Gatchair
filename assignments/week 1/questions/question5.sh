#!bin/bash
echo "Input numbers"
read n1 n2 n3 n4 n5 n6 n7 n8 n9 n10
array=($n1 $n2 $n3 $n4 $n5 $n6 $n7 $n8 $n9 $n10)
positive=0
negative=0
for num in ${array[@]}
do
    if [[ $num =~ ^[[:digit:]]+$ ]] 
    then
    positive=$(( $positive + 1 ))
    else
    negative=$(( $negative + 1 ))
    fi
done
echo "${positive} positive. ${negative} negative."
#Built by lesly, lukas, tyler and mario