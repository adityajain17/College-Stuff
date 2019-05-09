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
class customer
{
    int amount=10000;
    synchronized void withdraw(int amount) throws InterruptedException
    {
        System.out.println("going to withdraw");
        Thread.sleep(2000);
        if(this.amount<amount)
        {
            System.out.println("Less balance waiting for deposit");
            wait();
            this.amount-=amount;
            System.out.println("Withdraw Completed");
        }
    }
    synchronized void deposit(int amount)
    {
        System.out.println("Going to deposit");
        this.amount+=amount;
        System.out.println("Deposit Completed ");
        notify();
    }
}
public class Int
{
    public static void main(String[] args) throws InterruptedException 
    {
        customer ob=new customer();
        Thread t1=new Thread() 
        {
            @Override
            public void run() 
            {
                try {
                    ob.withdraw(12000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Int.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        t1.start();
        Thread t2=new Thread() 
        {
            @Override
            public void run() 
            {             
                    ob.deposit(12000);
            }
        };
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ob.amount);
    }
}
