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
public class HashTest 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.remove(100);
        System.out.println("");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
