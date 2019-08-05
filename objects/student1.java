/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class student1 {
int rollno;
String name;
long phno;
void display(){
System.out.println("student details are:");
System.out.println("roll no is"+rollno);
System.out.println(" name of the student:"+name);
System.out.println(" phone number is :"+phno);    
}
}
class details{
    public static void main(String[] args){
          student1 s1=new student1();
          student1 s2=new student1();
          student1 s3=new student1();
     s1.rollno=1;
     s1.name="raji";
     s1.phno=8097820139l;
     s2.rollno=2;
     s2.name="sruthi";
     s2.phno=8097132139l;
     s3.rollno=3;
     s3.name="keerthi";
     s3.phno=8092239139l;
     s1.display();
     s2.display();
     s3.display();
    }
}