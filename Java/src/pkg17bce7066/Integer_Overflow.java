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
public class Integer_Overflow 
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
    public static void main(String[] args) 
    {
        
        String s="abcdaazbdf";
        System.out.println(s);
        System.out.println(unique(s));
    }
}
