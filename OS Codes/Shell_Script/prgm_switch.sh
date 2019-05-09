echo "Enter the choice "
echo "1 list of files "
echo "2 list of users "
echo "3 delete a file "
read ch
case $ch in
1) echo "The list is "
'ls';;
2)echo  "The users are "
'who';;
3)echo "Enter the file to be deleted "
read frame
'rm' $frame;;
esac 
