/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;
import java.util.*;
/**
 *
 * @author User
 */
public class Temp 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double data[][]=new double[2][5];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                if(j==0)
                    data[i][j]=i+1;
                else
                    data[i][j]=sc.nextInt();
            }
        }
        double max=0,min=data[0][1];int rmax=0,cmax=0,rmin=0,cmin=0;
        for(i=0;i<2;i++)
        {
            for(j=1;j<5;j++)
            {
                if(max<data[i][j])
                {
                    max=data[i][j];
                    rmax=i+1;
                    cmax=j;
                }
                if(min>data[i][j])
                {
                    min=data[i][j];
                    rmin=i+1;
                    cmin=j;
                }
            }
        }
        System.out.println("Highest Temperature was recorded on Day"+rmax+" City"+cmax);
        System.out.println("Lowest Temperature was recorded on Day"+rmin+" City"+cmin);
    }
}
