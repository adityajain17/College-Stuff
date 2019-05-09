#!/bin/sh
echo "Enter a number"
read n
s=0
while [ "$n" -gt "0" ]
do
s=`expr $n + $s `
n=`expr $n - 1 `
done
echo "The sum is $s"