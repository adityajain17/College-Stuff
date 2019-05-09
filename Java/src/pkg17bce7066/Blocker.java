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
class Add extends Thread
{
    int val;
    public void run()
    {
        System.out.println("In Add Class");
        System.out.println("In Add Class");
        System.out.println("In Add Class");System.out.println("In Add Class");
        System.out.println("In Add Class");
        val=1+2;
        
    }
}
class Mul extends Thread
{
    int val;
    public void run()
    {
        System.out.println("In Mul Class");
        val=1*2;
    }
}
public class Blocker 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Add obj=new Add();
        Mul ob=new Mul();
        obj.start();
        obj.join();
        System.out.println("In main Thread running 1 ");
        ob.start();
        ob.join();
        System.out.println("In main Thread running 2");
        System.out.println(ob.val/obj.val);
    }
}
