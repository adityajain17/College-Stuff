echo "Enter the character"
read num
case $num in
	[0-9]) echo "You entered a digit"
			;;
	[a-z]) echo "You entered a lower case character"
			;;
	[A-Z]) echo "You entered a upper cae character"
			;;
	*) echo "You entered a special character"
			;;
esac  