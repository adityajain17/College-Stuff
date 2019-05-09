/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;


import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MQ1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            Date date = new Date();
            System.out.println(date + " " + "Hello World !");
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(MQ1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args) 
    {
         MQ1 ob=new MQ1();
         Thread t=new Thread(ob);
         t.start();
    }
}
