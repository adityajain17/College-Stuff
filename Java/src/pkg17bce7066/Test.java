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
class Library
{
    int Bookno;
    void getBookno(int b)
    {
        Bookno=b;
    }
    void display_Bookno()
    {
        System.out.println("Book Number "+Bookno);
    }
}
class Book extends Library
{
    String author;
    String title;
    void get_info(String author,String title)
    {
        this.author=author;
        this.title=title;
    }
    void disp_authntitle()
    {
        System.out.println("Author "+author);
        System.out.println("Title "+title);
    }
}
interface Branch
{
    String sub_name="JAVA";
    void disp_subname();
}
class Issue extends Book implements Branch
{
    public void disp_subname()
    {
        System.out.println("Subname "+sub_name);
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        Issue obj=new Issue();
        obj.getBookno(1204);
        obj.get_info("Sharma", "Programming");
        obj.display_Bookno();
        obj.disp_authntitle();
        obj.disp_subname();
    }
}
