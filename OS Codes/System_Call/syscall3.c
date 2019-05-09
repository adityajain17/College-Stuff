#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<string.h>
main()
{
	int fd,sz;
	fd=open("foo.txt",O_RDWR | O_CREAT |O_APPEND,0644);
	if(fd<0)
	{
		perror("r1");
		exit(1);
	}
	sz=write(fd,"cs241\n",strlen("cs241\n"));
	printf("called write (%d,\"cs241\\n\",%d),which returned %d\n",fd,strlen("cs241\n"),sz);
	close(fd);
}