/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author RAJI
 */

class raji2{
int a,b;
  raji2()
  {
  System.out.println("without parameters");
  a=10;
  b=20;
  }
  raji2(int x)
  {
  System.out.println("with one parameters");
  a=x;
  b=x;
  System.out.println("value of a is: "+a);
  System.out.println("value of a is: "+b);
  }
  raji2(int x,int y)
  {
  System.out.println("with two parameters");
  a=x;
  b=y;
  System.out.println("value of a is: "+a);
  System.out.println("value of a is: "+b);
  }
}
class totalcons {
    
    public static void main(String[] args){
    raji2 ob=new raji2();
    raji2 ob1=new raji2(30);
    raji2 ob2=new raji2(40,50);
    
    }
    
        
}
