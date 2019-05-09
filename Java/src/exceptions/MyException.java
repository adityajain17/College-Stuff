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
class Ex extends Exception
{
    Ex(String s)
    {
        super(s);
    }
//    public String toString()
//    {
//        return("I am Aditya Jain");
//    }
}
public class MyException 
{
    public static void main(String[] args) 
    {
        try
        {
            throw new Ex("Aditya Jain");
        }
        catch(Ex e)
        {
            System.out.println(e);
        }
    }
}
