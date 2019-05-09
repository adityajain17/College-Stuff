/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

/**
 *
 * @author User
 */
import java.util.*;
public class test8 
{
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> hs=new TreeSet<>();
        int n,m,i,j;
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int [m];
        for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(j=0;j<m;j++)
	{
		b[j]=sc.nextInt();
	}
	int c[]=new int[m*n];int co=0;int t;
        boolean flag=false;boolean f=true;
        i=0;
        while(i<n&&f)
	{
		for(j=0;j<m;j++)
		{
			flag=false;
			t=a[i]+b[j];
                        flag=hs.contains(t);
//			for(int k=0;k<co;k++)
//			{
//				if(c[k]==t)
//				{
//					flag=1;
//					break;
//				}
//			}
			if(!flag)
			{
				System.out.println(i+" "+j);
				hs.add(t);
				co++;
			}
			if(co==n+m-1)
			{
				f=false;
			}
		}
		i++;
	}
    }
}
