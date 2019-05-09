/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
class Book_2
{
    int id;
    String name,author,publisher;
    int quantity;
    public Book_2(int id,String na,String au,String pb,int qu)
    {
        this.id=id;
        name=na;
        author=au;
        publisher=pb;
        quantity=qu;
    }
}
public class BookHash 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Book_2> map=new HashMap<>();
        Book_2 b1=new Book_2(100,"Let us C","Yashwanth Kanetkar","BPB",18);
        Book_2 b2=new Book_2(101,"Java The Complete Reference","Herbert Schidt","Macmillan",20);
        Book_2 b3=new Book_2(102,"OpenGl","Sokoi M","Bhanu",25);
        map.put(1, b1);
        map.put(2,b2);
        map.put(3,b3);
        for(Map.Entry m:map.entrySet())
        {
            int key=(int) m.getKey();
            Book_2 b=(Book_2) m.getValue();
            System.out.println("Key: "+key);
            System.out.println("Details: "+b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        Book_2 b4=new Book_2(100,"Java","Sumita Arora","DE",24);
        map.replace(1,b4);
        System.out.println("");
        for(Map.Entry m:map.entrySet())
        {
            int key=(int) m.getKey();
            Book_2 b=(Book_2) m.getValue();
            System.out.println("Key: "+key);
            System.out.println("Details: "+b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}