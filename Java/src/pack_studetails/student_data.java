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
import pack_student.*;
public class student_data extends student 
{
    protected float height;
    protected float weight;
    public student_data(String n,int a,float h,float w)
    {
        super(n,a);
        height=h;
        weight=w;
    }
}
