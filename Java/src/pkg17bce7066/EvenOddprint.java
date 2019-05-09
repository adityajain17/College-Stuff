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
public class EvenOddprint 
{
    int n=10;
    boolean odd=true;
    int c=1;
    synchronized void displayodd()
    {
        while(c<n)
        {
            if(!odd)
            {
                try
                {
                    wait();
                } 
                catch (InterruptedException ex) 
                {
                    
                }
            }
            notify();
            System.out.println("Odd Thread "+c);
            c++;
            odd=false;
            
        }
    }
    synchronized void displayeven()
    {
        while(c<n)
        {
            if(odd)
            {
                try
                {
                    wait();
                } 
                catch (InterruptedException ex) 
                {
                    
                }
            }
            notify();
            System.out.println("Even Thread "+c);
            c++;
            odd=true;
            
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        EvenOddprint obj=new EvenOddprint();
        obj.odd=true;
        Thread t1 =new Thread(new Runnable() {
            public void run() 
            {
                obj.displayodd();
            }
        });
        Thread t2 =new Thread(new Runnable() {
            public void run() 
            {
                obj.displayeven();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}