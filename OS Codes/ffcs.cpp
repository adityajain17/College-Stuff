#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n;
	printf("Enter the number of processors :");
	scanf("%d",&n);
	int b[n];
	for(int i=0;i<n;i++)
	{
		printf("Enter the burst time of prcocess %d : ",(i+1));
		scanf("%d",&b[i]);
	}
	int wait[n];int c=0;float ta=0;
	printf("The waiting time,CPU allocation and turnaround time is : \n");
	for(int i=0;i<n;i++)
	{
		ta=ta+c+b[i];
		printf("Prcoess %d:	%d\t%d\t%d\n",(i+1),c,c,c+b[i]);
		wait[i]=c;
		c=c+b[i];
	}
	int s=0;
	for(int i=0;i<n;i++)
	{
		s+=wait[i];
	}
	float av=(float)s/n;
	ta=(float)ta/n;
	printf("The average waiting time is : %f \n",av);
	printf("The average turnaround time is : %f \n",ta);
}