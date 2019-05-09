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
import java.util.*;
public class Buffer_Overflow 
{
    public static void main(String[] args)
    {
        int[] tests = new int[10];
    int test;
    int count;
    Scanner scan = new Scanner(System.in);

    System.out.print("How many numbers? ");
    count = scan.nextInt();
    for (int i =0 ; i < count; i++)
    {
    	System.out.print("Please type a number: ");
   	test  = scan.nextInt();
    	tests[i]= test;
    }
    Object x="adi";
        System.out.println(x.hashCode());
    }
}
