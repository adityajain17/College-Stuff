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
import java.io.*;
import java.util.ArrayList;
public class ACMICPC_2017 
{
    public static void main(String[] args) throws IOException 
    {
        java.io.BufferedReader r = new java.io.BufferedReader
        (new java.io.InputStreamReader (System.in));
        int n=Integer.parseInt(r.readLine());
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int a[]=new int[3];
            int b[]=new int[3];
            int c[]=new int[3];
            for(int j=0;j<3;j++)
                a[j]=Integer.parseInt(r.readLine());
            for(int j=0;j<3;j++)
                b[j]=Integer.parseInt(r.readLine());
            for(int j=0;j<3;j++)
                c[j]=Integer.parseInt(r.readLine());
            if(a[0]>b[0]&&a[1]>b[1]&&a[2]>b[2])
                count++;
            if(a[0]>c[0]&&a[1]>c[1]&&a[2]>c[2])
                count++;
            if(b[0]>a[0]&&b[1]>a[1]&&b[2]>a[2])
                count++;
            if(b[0]>c[0]&&b[1]>c[1]&&b[2]>c[2])
                count++;
            if(c[0]>a[0]&&c[1]>a[1]&&c[2]>a[2])
                count++;
            if(c[0]>b[0]&&c[1]>b[1]&&c[2]>b[2])
                count++;
            if(count==3)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
