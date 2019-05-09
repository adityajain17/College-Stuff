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
public class DiffDate 
{
    public static void main(String[] args) throws IOException 
    {
        int d[]={31,28,31,30,31,30,31,31,30,31,30,31};
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String d1,d2;
        System.out.println("Enter first date : ");
        d1=in.readLine();
        System.out.println("Enter second date : ");
        d2=in.readLine();
        int da1=Integer.parseInt(d1.substring(0, 2));
        int mm1=Integer.parseInt(d1.substring(3,5));
        int yy1=Integer.parseInt(d1.substring(6));
        int da2=Integer.parseInt(d2.substring(0, 2));
        int mm2=Integer.parseInt(d2.substring(3,5));
        int yy2=Integer.parseInt(d2.substring(6));
        if(yy1==yy2)
        {
            if(mm1==mm2)
            {
                System.out.println("Difference in days: "+(da2-da1));
            }
            else
            {
                int diff=0;
                diff+=d[mm1-1]-da1;
                mm1+=1;
                while(mm1<=mm2-1)
                {
                    diff+=d[mm1-1];
                    mm1=mm1+1;
                }
                diff+=da2;
                System.out.println("Difference in days: "+(diff-1));
            }
        }
        else
        {
            int diff=0;
            diff+=d[mm1-1]-da1;
            mm1+=1;
            while(yy1!=yy2)
            {
                while(true)
                {
                    diff+=d[mm1-1];
                    mm1=mm1+1;
                    if(mm1==13)
                    {
                        mm1=1;
                        yy1+=1;
                    }
                    if(yy1==yy2&&mm1==mm2)
                        break;
                }
            }
            diff=diff+da2;
            System.out.println("Difference in days: "+(diff));
        }
    }
}
