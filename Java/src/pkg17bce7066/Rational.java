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
public class Rational 
{
    int n;
    int d;
    public Rational()
    {
        n=0;
        d=1;
    }
    public Rational(int a,int b)
    {
        if(b==0)
        {
            System.exit(0);
        }
        else
        {
            n=a;
            d=b;
            simplify();
        }
    }
    private void simplify()
    {
        int gcd=Rational.getGCD(n,d);
        n=n/gcd;
        d=d/gcd;
    }
    private static int getGCD(int x,int y)
    {
        int g=1;
        int m=(int)(Math.min(x,y));
        for(int i=m;i>=1;i--)
        {
            if((x%i==0)&&(y%i==0))
            {
                g=i;
                break;
            }
        }
        return g;
    }
    public double GetValue()
    {
        double ans=(double)n/(double)d;
        return ans;
    }
    public String toString()
    {
        return(n+"/"+d);
    }
    public static void main(String[] args) 
    {
        Rational obj=new Rational(40,12);
        System.out.println("Deimal form : "+obj.GetValue());
        System.out.println("String form : "+obj.toString());
    }
}
