/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class studentdetails{
    int rollno,phoneno;
    void display(){
        System.out.println(rollno);
        System.out.println(phoneno);
    }
}
public class  Studentdetails1
{
public static void main(String[] args)
{
studentdetails obj=new studentdetails();
obj.rollno=14;
obj.phoneno=8074652077;
obj.display();
}
}