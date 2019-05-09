#include<stdio.h>
#include<stdlib.h>

void swap(int &,int &);
void sort(int p[],int q[],int n);

int main()
{
    int n;
    printf("Enter the  no of  processes:");
    scanf("%d",&n);
    int pro[n],q[n];
    for(int i=0;i<n;i++)
    {
        q[i]=i+1;
    }
    for(int i=0;i<n;i++)
    {
        printf("Enter the burst time of process %d: ",(i+1));
        scanf("%d",&pro[i]);
    }
    sort(pro,q,n);
    printf("The waiting time and CPU allocation time and turnaround time of the processes are as follows: \n");
    int sumWait=0,sumTurn=0;
    for(int i=0;i<n;i++)
    {
        int x=0;
        for(int j=0;j<i;j++)
        {
            x+=pro[j];
        }
        sumWait+=x;
        sumTurn+=x+pro[i];
        printf("Process  %d:    %d\t%d\t%d\n",q[i],x,x,(x+pro[i]));
    }
    float avgWait=(float)sumWait/n;
    float avgTurn=(float)sumTurn/n;
    printf("The Average Waiting time is : %f\n",avgWait);
    printf("The average turnaround time is : %f\n",avgTurn);
}

void swap(int &x,int &y)
{
    int temp=x;
    x=y;
    y=temp;
}

void sort(int p[],int q[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(p[j]>p[j+1])
            {
                swap(p[j],p[j+1]);
                swap(q[j],q[j+1]);
            }
        }
    }
}