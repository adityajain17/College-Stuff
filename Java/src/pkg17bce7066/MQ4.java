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
class GenericStack<T>
{
    private int stacksize;
    private T[] sarray;
    private int top;
    public GenericStack(int size)
    {
        stacksize=size;
        sarray=(T[]) new Object[size];
        this.top=-1;
    }
    public void push(T entry)
    {
        if(top!=stacksize-1)
        {
            top++;
            sarray[top]=entry;
        }
        else
        {
            System.out.println("Stack is full");
        }
    }
    public T pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            int x=top;
            top--;
            return sarray[x];
        }
        return null;
    }
}
public class MQ4 
{
    public static void main(String[] args) 
    {
        GenericStack<String> ob=new GenericStack(5);
        ob.push("Aditya");
        ob.push("Vishal");
        System.out.println(ob.pop());
        System.out.println(ob.pop());
    }
}
