/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Cd_Chef_Feb_2 
{
    public static String unique(String x)
    {
        String un="";
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(un.indexOf(ch)==-1)
            {
                un=un+ch;
            }
        }
        return un;
    }
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int t,n;
        t=Integer.parseInt(in.readLine());
        for(int i=0;i<t;i++)
        {
            n=Integer.parseInt(in.readLine());
            String s[]=new String[n];
            int mini=0,te=0;
            for(int j=0;j<n;j++)
            {
                s[j]=in.readLine();
                if(te>s[j].length()||j==0)
                {
                    te=s[j].length();
                    mini=j;
                }
            }
            String ch=unique(s[mini]);
            int c=0;int flag=0;
            for(int k=0;k<ch.length();k++)
            {
                flag=0;
                for(int l=0;l<n;l++)
                {
                    if(s[l].indexOf(ch.charAt(k))==-1)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                    c++;
            }
            System.out.println(c);
        }
    }
}
