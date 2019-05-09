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
	int shm_fd;
	void *ptr;

	shm_fd = open(name, O_CREAT | O_RDWR, 0666);
	ftruncate(shm_fd, SIZE);
	ptr = mmap(NULL, SIZE, PROT_READ, MAP_SHARED, shm_fd, 0);
	printf( "%s", (char* )ptr);
	unlink(name);
	return 0;
}