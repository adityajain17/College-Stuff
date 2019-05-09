ch=y
while [ "$ch" != "n" ]
do
echo "Enter a number "
read number
fact=1
while [ "$number" -gt "1" ]
do
fact=`expr $fact \* $number `
number=`expr $number - 1 `
done
echo "factorial is $fact"
echo "if you want to continue (y/n) ?"
read ch
done