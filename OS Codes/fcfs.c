#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n,t;
	printf("Enter the number of processes \n");
	scanf("%d",&n);
	int pid[n],burst[n],arr[n];
	for(int i=0;i<n;i++)
	{
		printf("Enter the process details pid,burst,arrival %d \n",(i+1));
		scanf("%d %d %d",&pid[i],&burst[i],&arr[i]);
	}
	for(int i=0;i<n;i++)
	{
		printf("The process details pid,burst,arrival %d \n",(i+1));
		printf("%d %d %d \n",pid[i],burst[i],arr[i]);
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;

				t=pid[j];
				pid[j]=pid[j+1];
				pid[j+1]=t;

				t=burst[j];
				burst[j]=burst[j+1];
				burst[j+1]=t;
			}
		}
	}
	printf("Process in order of their arrival time are : \n");
	printf("PID\tBurst Time\tArrival Time \n");
	for(int i=0;i<n;i++)
	{
		printf("%d  \t  %d         \t %d  \n",pid[i],burst[i],arr[i]);
	}
	int ct[n]={0};int c=0;int tat[n]={0};int wt[n]={0};float avgwt=0,avgtat=0;
	for(int i=0;i<n;i++)
	{
		if(c<arr[i])
		{
			c=arr[i]+burst[i];
		}
		else
		{
			c=c+burst[i];
		}
		ct[i]=c;
		tat[i]=ct[i]-arr[i];
		wt[i]=tat[i]-burst[i];
		avgwt=avgwt+wt[i];
		avgtat=avgtat+tat[i];
	}
	printf("After Scheduling in FCFS order details are :\n");
	printf("PID\tAT\tBT\tCT\tTAT\tWT \n");
	for(int i=0;i<n;i++)
	{
		printf("%d\t%d\t%d\t%d\t%d\t%d\t \n",pid[i],arr[i],burst[i],ct[i],tat[i],wt[i]);
	}
	printf("Average waiting time %f \n",avgwt/n);
	printf("Average turn-around time %f \n",avgtat/n);
}