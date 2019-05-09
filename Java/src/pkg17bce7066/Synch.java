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
class Callme
{
    synchronized void call(String msg) throws InterruptedException
    {
        System.out.print("["+msg);
        Thread.sleep(1000);
        System.out.println("]");
    }
}
class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;
    Caller(Callme targ,String msg)
    {
        target=targ;
        this.msg=msg;
        t=new Thread(this);
    }
    public void run()
    {
        try {
            target.call(msg);
        } catch (InterruptedException ex) {
            Logger.getLogger(Caller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
public class Synch 
{
    public static void main(String[] args) 
    {
        Callme target=new Callme();
        Caller obj1=new Caller(target,"Hello");
        Caller obj2=new Caller(target,"Synchronized");
        Caller obj3=new Caller(target,"World");
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();
    }
}
