/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author User
 */
class Level1Exception extends Exception {} 
class Level2Exception extends Level1Exception {} 
class Level3Exception extends Level2Exception {} 
 
class A 
{   
    public void f() throws Level1Exception 
    {    
        System.out.println("Hi");
        throw new Level1Exception();   
    } 
} 
class B extends A 
{   
    public void f() 
            throws Level2Exception 
    {     
        throw new Level2Exception();   
    } 
} 
 
class C extends B 
{   
    public void f() 
            throws Level3Exception 
    {     
        System.out.println("Hello");
        throw new Level3Exception();   
    } 
} 
 
public class E25_ThreeLevelExceptions 
{   
    public static void main(String args[]) 
    {     
        A a = new C();     
        try 
        {       
            a.f();     
        } 
        catch(Level1Exception e) 
        {       
            System.out.println("Caught " + e);     
        }   
    } 
}