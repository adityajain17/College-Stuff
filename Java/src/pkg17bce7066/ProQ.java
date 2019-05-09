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
class Q
{
    int n;
    boolean value=false;
    synchronized public int get()
    {
        System.out.println("Got "+n);
        return n;
    }
    synchronized public void put(int n)
    {
        System.out.println("Put "+n);
        this.n=n;
    }
}
class Producer extends Thread
{
    Q p;
    Producer(Q ob)
    {
        p=ob;
    }
    public void run()
    {
        int i=0;
        while(i<=20)
        {
            p.put(i);
            i++;
        }
    }
}
class Consusmer extends Thread
{
    Q c;
    Consusmer(Q ob)
    {
        c=ob;
    }
    public void run()
    {
        while(true)
        {
            c.n=c.get();
        }
    }
}
public class ProQ 
{
    public static void main(String[] args) 
    {
        Q m=new Q();
        Producer t1=new Producer(m);
        Consusmer t2=new Consusmer(m);
        t1.start();
        t2.start();
    }
}
