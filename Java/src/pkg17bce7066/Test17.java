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
public class Test17 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int t;String s;int flag=0;
        t = Integer.parseInt(in.readLine());
        while (t>0) 
        {
            s = in.readLine();
            flag=0;
            String ar[] = s.split(" ");
            int j = 0;
            for (j = 0; j < ar.length; j++) 
            {
                if (ar[j].compareTo("not")==0)
                {
                    System.out.println("Real Fancy");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("regularly fancy");
            }
            t--;
        }
    }
}
