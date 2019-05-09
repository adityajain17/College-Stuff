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
class Gen<T>
{
    T ob;
    Gen(T o)
    {
        ob=o;
    }
    T getob()
    {
        return ob;
    }
    void showType()
    {
        System.out.println(ob.getClass().getName());
    }
}
public class GenDemo 
{
    public static void main(String[] args) 
    {
        Gen<Integer> ob=new Gen<>(88);
        ob.showType();
    }
}
