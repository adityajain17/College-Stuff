/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17bce7066;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */

public class DataBase 
{
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/library";
        String usn="root";
        String pd="root";
        Connection con=DriverManager.getConnection(url, usn, pd);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select ISBN1 from student where reg='17BCE7066'");
        if(rs.next())
        {
            System.out.println(rs.getString(1));
        }
        else
        {
            System.out.println("Fuck");
        }
        st.close();
        con.close();
    }
}