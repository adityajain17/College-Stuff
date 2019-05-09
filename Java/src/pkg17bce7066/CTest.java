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
class Re
{
    synchronized public void print1()
    {
        System.out.println("Hello"+Thread.currentThread().getName());
    }
    synchronized public void display()
    {
     
        System.out.println("Hi"+Thread.currentThread().getName());
    }
}
class Aa extends Thread
{
    Re x;
    Aa(Re o)
    {
        x=o;
    }
    public void run()
    {
        while(true)
        {
            x.print1();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class Bb extends Thread
{
    Re x;
    Bb(Re o)
    {
        x=o;
    }
    public void run()
    {
        while(true)
        {
            x.display();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bb.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class CTest
{
    public void run()
    {
        
    }
    public static void main(String[] args) 
    {
        Re x=new Re();
        Aa ob1=new Aa(x);
        Bb ob2=new Bb(x);
        ob1.start();
        ob2.start();
    }
}
