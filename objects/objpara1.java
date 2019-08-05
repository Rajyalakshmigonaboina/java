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

class raji1{
  int a;
  raji1(){
  int a=40;
  System.out.println("value is:"+a);
  }
  void display(raji1 ob)
  {
  
  a=ob.a;
  System.out.println("value is:"+ob.a);
  System.out.println("value is:"+a);
  }
}
class objpara1 {
public static void main(String[] args){
raji1 ob=new raji1();
raji1 ob1=new raji1();
ob1.display(ob);
ob.a=70;
ob1.display(ob);
}    
}
