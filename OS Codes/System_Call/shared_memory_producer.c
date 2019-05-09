#include<stdio.h>
#include<stdlib.h>
#include <string.h>
#include<fcntl.h>
#include<sys/shm.h>
#include<sys/mman.h>
#include<sys/stat.h>

int main() {
	const int SIZE = 4096;
	const char *name = "Adi";
	const char *message1 = "Hello \n";
	const char *message2 = "My name is Aditya Jain \n";
	int shm_fd;
	void *ptr;

	shm_fd = open(name, O_CREAT | O_RDWR, 0666);
	ftruncate(shm_fd, SIZE);
	ptr = mmap(NULL, SIZE, PROT_WRITE, MAP_SHARED, shm_fd, 0);
	sprintf(ptr, "%s", message1);
	ptr+=strlen(message1);
	sprintf(ptr,"%s",message2);
	ptr+=strlen(message2);
	return 0;
}