num()
{
	if [ "$1" -gt "1" ]
	then
		i=`expr $1 - 1`
		j=`num $i`
		k=`expr $1 \* $j`
		echo $k
	else
		echo 1
	fi
}

while :
do
	echo "Enter a number"
	read a
	num $a
done