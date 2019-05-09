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
public class TestSleep implements Runnable
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try 
            {
                Thread.sleep(5000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(TestSleep.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        TestSleep ts=new TestSleep();
        Thread t1=new Thread(ts);
        t1.start();
    }
}
