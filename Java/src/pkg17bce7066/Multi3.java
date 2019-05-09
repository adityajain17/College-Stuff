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
public class Multi3 {

//    public void run() 
//        {         
//            //System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
//        }
    public static void main(String args[]) throws InterruptedException {
        //Multi3 m1 = new Multi3();
//        Multi3 m2=new Multi3();
//        m2.setPriority(Thread.MAX_PRIORITY);
//        m1.start();
//        m2.start();
//        Thread t1 = new Thread(m1);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        System.out.println(t1.getId());
//        System.out.println(Thread.currentThread().isDaemon());
//        System.out.println();
       // System.out.println(Thread.currentThread().toString());
//        Thread t2=new Thread(m1);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t2.start();
//        System.out.println(t2.getId());
//        Thread t3=new Thread(m1);
//        t3.start();
//        System.out.println(t3.getId());
        Thread x=new Thread(new Runnable(){
            public void run() {
                System.out.println("Hello");;
            }
            
        });
        x.start();
        x.join();
        System.out.println("Aditya");
    }
}
