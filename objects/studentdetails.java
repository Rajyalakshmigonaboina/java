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
        rollno=14;
        phoneno=8074652077;
        System.out.println(rollno);
        System.out.println(phoneno);
    }
}
public class  studentdetails1{

public static void main(String[] args){
    
studentdetails obj=new studentdetails();
obj.display();

}
}