num()
{
	s=0
	number=$1
	while [ "$number" -gt "0" ]
	do
	d=`expr $number \% 10 `
	s=`expr $s + $d`
	number=`expr $number / 10`
	done
	echo "The sum is $s"
}

while :
do
	echo "Enter a number"
	read a
	num $a
done