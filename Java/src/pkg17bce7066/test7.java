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

class H1
{
    public void show()
    {
        System.out.println("H1");
    }
}
class H2 extends H1
{
    public void show()
    {
        System.out.println("H2");
    }
}
class H3 extends H2
{
    public void show()
    {
        System.out.println("H3");
    }
}
public class test7 
{
    public static void main(String[] args) 
    {
        H3 x=new H3();
        H1 ob=(H1)x;
        System.out.println(ob.getClass());
       // x.show();
    }
}
