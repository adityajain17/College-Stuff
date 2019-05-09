#include<stdio.h>
void main()
{
	int block_size[10],process_size[10],block_num,process_num,flags[10],allocation[10],i,j;
	for(i=0;i<10;i++)
	{
		flags[i]=0;
		allocation[i]=-1;
	}
	printf("Enter the number of blocks in the memory: \n");
	scanf("%d",&block_num);

	printf("\n Enter the size of each block in the memory: \n");
	for(i=0;i<block_num;i++)
	{
		scanf("%d",&block_size[i]);
	}
	printf("\n Enter the number of processes: \n");
	scanf("%d",&process_num);

	printf("\n Enter the size of each process in the memory: \n");
	for(i=0;i<process_num;i++)
	{
		scanf("%d",&process_size[i]);
	}

	int t=0,in=0;
	for(i=0;i<process_num;i++)
	{
		t=0;
		for(j=0;j<block_num;j++)
		{
			if(flags[j]==0&&block_size[j]>=process_size[i]&&block_size[j]>t)
			{
				t=block_size[j];
				in=j;
			}
		}
		allocation[in]=i;
		flags[in]=1;
	}
	//Display Allocation Details
	printf("\nBlock_Num\tsize\t\tprocess_num");
	for(i=0;i<block_num;i++)
	{
		printf("\n%d \t\t %d \t\t",i+1,block_size[i]);
		if(flags[i]==1)
			printf("%d\t\t",allocation[i]+1);
		else
			printf("Not allocated");
	}
	printf("\n");
}