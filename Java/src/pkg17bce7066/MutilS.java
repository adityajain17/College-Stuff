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
class A extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 500; i++) 
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(i);
        }
    }
}
public class MutilS 
{
    public static void main(String[] args) throws InterruptedException 
    {
        A t1=new A();
        t1.start();
        Thread.sleep(500);
        t1.stop();
    }
}
