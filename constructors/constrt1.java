/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class construct1 
{
    int a;
    void display()
    {
    System.out.println(a);
    }
}
class testofp{
public static void main(String[] args){
construct1 ob1=new construct1();
ob1.a=10;
construct1 ob2=ob1;
ob1.display();
ob2.display();
ob2.a=20;
ob1=null;
ob1.display();
ob2.display();

}

}