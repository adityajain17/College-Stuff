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
class Table
{
    synchronized public void printTable(int n)
    {
        int i=1;
        for(;i<=5;i++)
        {
            //System.out.println(Thread.currentThread().getName()+" is it locked "+Thread.holdsLock(this));
            System.out.println(n*i);
        }
    }
}
class MyThread1 extends Thread
{
    Table t;
    MyThread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        //System.out.println(Thread.currentThread().getState());
        t.printTable(5);
    }
           
}
class MyThread2 extends Thread
{
    Table t;
    MyThread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }
           
}
public class TestSync 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Table obj=new Table();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        //t1.join();
        t2.start();
    }
}
