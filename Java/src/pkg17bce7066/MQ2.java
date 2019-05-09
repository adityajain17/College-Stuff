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
class MyThread3 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
class MyThread4 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=11;i++)
        {
            if(i%2!=0)
                System.out.println(i);
        } 
    }
}

public class MQ2
{
    public static void main(String[] args) throws InterruptedException 
    {
        MyThread3 ob=new MyThread3();
        MyThread4 ob1=new MyThread4();
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob1);
        t1.start();
        t1.join();
        t2.start();
    }
}
