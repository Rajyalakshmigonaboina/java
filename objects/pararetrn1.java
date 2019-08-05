/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
    class texts{
        int a;
        texts()
        {
        a=20;
        System.out.println("value is:"+a);
        }
       int display()
       {
       return a;    
       }
       void prints(int x){
           a=x;
           System.out.println("value is x is:"+a);
       }
       int shows(int x){
       a=x;
       return a;
       }
    
    }
class tops{
public static void main(String[] args){
texts ob=new texts();
int c=ob.display();
System.out.println("valueof c is:"+c);
ob.prints(40);
int d=ob.shows(40);
System.out.println("value of d is:"+d);
 }
}