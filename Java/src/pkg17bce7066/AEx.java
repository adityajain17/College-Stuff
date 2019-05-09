/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AEx 
{
    public static void main(String[] args) 
    {
//        int a=42,b=0,c;
//        try
//        {
//            c=a/b;
//            System.out.println("Result after division "+c);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//        try
//        {
//            String x = null;
//            System.out.println(x.charAt(0));
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println(e);
//        }
//        try
//        {
//            String a="Aditya";
//            System.out.println(a.charAt(10));
//        }
//        catch(StringIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }
//        File file=new File("C:\\Users\\User\\Desktop");
//        try 
//        {
//            FileReader fr=new FileReader(file);
//        } 
//        catch (FileNotFoundException ex) 
//        {
//            System.out.println(ex);
//        }
//        try
//        {
//            String x="Aditya Jain";
//            int a=Integer.parseInt(x);
//        }
//        catch(NumberFormatException e)
//        {
//            System.out.println(e);
//        }
          try
          {
              int a[]=new int [9];
              a[12]=2;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println(e);
          }
    }
}
