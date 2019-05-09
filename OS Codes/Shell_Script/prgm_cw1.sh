echo "Enter a number "
read number
echo "1 for reverse"
echo "2 for binary "
echo "3 for fibonacci"
read ch
case $ch in
1) r=0 #this is reversing
while [ "$number" -gt "0" ]
do
d=`expr $number \% 10 `
r=`expr $r \* 10 + $d`
#r=`expr $r \+ $d `
number=`expr $number / 10`
done
echo "The reverse is $r ";;

2)bin=0 #this is binary
i=1
while [ "$number" -gt "0" ]
do
d=`expr $number \% 2 `
t=`expr $i \* $d `
bin=`expr $bin \+ $t `
i=`expr $i \* 10 `
number=`expr $number / 2 `
done
echo "The binary is $bin";;

3)a=0 #this is fibonacci
b=1
c=0
echo $a
echo $b
while [ "$number" -gt "2" ]
do
c=`expr $a + $b `
a=$b
b=$c
echo $c
number=`expr $number \- 1 `
done;;
esac