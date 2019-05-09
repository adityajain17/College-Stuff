#include<stdio.h>
 
void main()
{
	int fragment[20],block[20],process[20],i,j,nb,np,temp,lowest=9999;
	static int blockarray[20],processarray[20];
	printf("\nEnter the number of blocks:");
	scanf("%d",&nb);
	printf("Enter the number of processes:");
	scanf("%d",&np);
	
	printf("\nEnter the size of the blocks:-\n");
	for(i=1;i<=nb;i++)
    {
		printf("Block no.%d:",i);
        scanf("%d",&block[i]);
    }
	
	printf("\nEnter the size of the processes :-\n");
	for(i=1;i<=np;i++)
    {
        printf("Process no.%d:",i);
        scanf("%d",&process[i]);
    }
	
	for(i=1;i<=np;i++)
	{
		for(j=1;j<=nb;j++)
		{
			if(blockarray[j]!=1)
			{
				temp=block[j]-process[i];
				if(temp>=0)
					if(lowest>temp)
					{
						processarray[i]=j;
						lowest=temp;
					}
			}
		}
		
		fragment[i]=lowest;
		blockarray[processarray[i]]=1;
		lowest=10000;
	}
	
	printf("\nProcess_no\tProcess_size\tBlock_no\tBlock_size\tFragment");
	for(i=1;i<=np && processarray[i]!=0;i++)
		printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%d",i,process[i],processarray[i],block[processarray[i]],fragment[i]);
	printf("\n");
}