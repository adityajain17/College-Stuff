#include<stdio.h>
#include<stdlib.h>
void xyz()
{
	printf("Hello \n");
}
void abc()
{
	printf("Good \n");
}
void ijk()
{
	printf("Morning \n");	
}
int main()
{
	
	atexit(xyz);
	atexit(abc);
	atexit(ijk);
}