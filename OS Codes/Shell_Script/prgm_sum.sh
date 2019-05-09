sum=0
for i in 1 2 3 4
do
sum=`expr $sum + $i `
done
echo "The sum is $sum"