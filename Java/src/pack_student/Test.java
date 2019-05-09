/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
class Ex extends Exception
{
    
}
class Ex2
{
    public void validate()throws Ex
    {
        throw new Ex();
    }
}
public class Test 
{
    public static void main(String[] args) throws Ex, SQLException 
    {
//        Ex2 obj=new Ex2();
//        obj.validate();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
        Statement st = con.createStatement();
        ResultSet rs;
    }
}
