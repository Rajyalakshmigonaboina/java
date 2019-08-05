/*
 * To change this license header,
choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class test2
{
test2()
{
System.out.println("constructor");
}
void display(){
System.out.println("rajii");    
    
}
void print(){
System.out.println("heloooo");
}
}
class constructors{
public static void main(String[] args){
    test2 ob= new test2();
    ob.display();
    ob.print();
}    
}
