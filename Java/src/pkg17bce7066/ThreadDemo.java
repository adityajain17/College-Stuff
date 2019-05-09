/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
class NewThread implements Runnable
{
    Thread t;
    NewThread()
    {
        t=new Thread(this);
        System.out.println("Child Thread");
    }
    public void run()
    {
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("ChildThread "+Thread.currentThread().getName()+" "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Exiting ChildThread");
    }
}
public class ThreadDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {
        NewThread nt=new NewThread();
        NewThread nt1=new NewThread();
        nt.t.start();
        nt1.t.start();
        nt.t.join();
        System.out.println("Hello");
        System.out.println("Main Thread Exiting ");
    }
}
