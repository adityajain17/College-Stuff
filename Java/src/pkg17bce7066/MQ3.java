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
class MyException extends Exception
{
    String msg;
    MyException(String x)
    {
        msg=x;
    }
}
public class MQ3 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new MyException("Welcome to VIT-AP family");
        } 
        catch (MyException ex) 
        {
            System.out.println(ex.msg);
        }
    }
}