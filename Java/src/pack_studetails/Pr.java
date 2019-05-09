/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_studetails;

/**
 *
 * @author User
 */
class Printtable
{
    synchronized public void print(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(n*i);
        }
    }
}
public class Pr 
{
    public static void main(String[] args) 
    {
        Printtable ob=new Printtable();
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                ob.print(2);
            }
        });
        Thread t2=new Thread(new Runnable()
        {
            public void run()
            {
                ob.print(3);
            }
        });
        Thread t3=new Thread(new Runnable()
        {
            public void run()
            {
                ob.print(4);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
