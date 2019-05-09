#include<stdio.h>
#include<string.h>
#include<unistd.h>
#include<fcntl.h>
int main(void)
{
	int fd[2];
	char buf1[12]="Hello";
	char buf2[12];
	fd[0]=open("abc1.txt",O_RDWR);
	fd[1]=open("abc2.txt",O_RDWR);
	
}