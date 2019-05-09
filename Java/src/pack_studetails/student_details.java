/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_studetails;

/**
 *
 * @author User
 */
public class student_details extends student_data
{
    protected char gender;
    public student_details(String n,int a,float h,float w,char g)
    {
        super(n,a,h,w);
        gender=g;
    }
    public void show_data()
    {
        System.out.println("Name "+name);
        System.out.println("Age "+age);
        System.out.println("Height "+height);
        System.out.println("Weight "+weight);
        System.out.println("Gender "+gender);
    }
}
