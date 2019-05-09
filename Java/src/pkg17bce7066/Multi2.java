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
class X extends Thread 
{
    synchronized public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
public class Multi2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        X t1=new X();
        X t2=new X();
        System.out.println(t1.getName()+" ID: "+t1.getId());
        System.out.println(t2.getName()+" ID: "+t2.getId());
        t1.start();
        t1.join();
        X.yield();
        t2.start();
    }
}
