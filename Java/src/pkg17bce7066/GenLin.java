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
class node<T>
{
    T data;
    node next;
}
public class GenLin<T> extends node
{
    node head=null;
    node tail=null;
    public void insert(T data)
    {
        node<T> p=new node<T>();
        p.data=data;
        p.next=null;
        if(head==null)
        {
            head=tail=p;
        }
        else
        {
            tail.next=p;
            tail=p;
        }
    }
    public void display()
    {
        node t=head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
    public static void main(String[] args) 
    {
        GenLin<String>l1=new GenLin<String>();
        l1.insert("Adi");
        l1.insert("Vishal");
        l1.insert("Sumanth");
        l1.insert("Abhay");
        l1.display();
    }
}
