echo "Enter the time"
read time
if [ $time -lt 10 ]
then
echo "Good Morning"
elif [ $time -lt 15 ]
then
echo "Good Afternoon"
elif [ $time -lt 19 ]
then
echo "Good Evening"
else
echo "Good Night"
fi