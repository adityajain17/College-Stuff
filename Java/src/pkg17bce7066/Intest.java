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
class A1
{
    public void display()
    {
        System.out.println("Hello");
    }
}
class A2 extends A1
{
    public void display()
    {
        System.out.println("Hi");
    }
}
class A3 extends A2
{
    public void display()
    {
        System.out.println("Aditya");
    }
}
public class Intest 
{
    public static void main(String[] args) 
    {
        A1 obj=new A3();
        A3 x= (A3)obj;
        x.display();
    }
}
