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
class TestInterrupting extends Thread{  
public void run(){  
for(int i=1;i<=2;i++){  
if(Thread.interrupted()){  
System.out.println("code for interrupted thread "+i);  
    System.out.println(Thread.currentThread().isInterrupted());
}  
else{  
System.out.println("code for normal thread"+i);  
System.out.println(Thread.currentThread().isInterrupted());
}  
 System.out.println(Thread.currentThread().isInterrupted());
}//end of for loop  
}  
  
public static void main(String args[]){  
  
TestInterrupting t1=new TestInterrupting();  
TestInterrupting t2=new TestInterrupting();  
  
t1.start();  
t1.interrupt();  
  
//t2.start();  
  
}   
}  