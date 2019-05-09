echo "Enter Principal"
read p
echo "Enter rate"
read ra
echo "Enter time"
read t
si=`expr $p \* $t \* $ra / 100 ` 
echo "The SI is: $si"