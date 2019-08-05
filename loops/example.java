/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class xample 
{
    int a;
    void display()
    {
        a=10;
        System.out.println(a);
    }
    
}
class test
{
public static void main(String[] args){
    xample obj=new xample();
     obj.display();
       obj.a=30;
      
        System.out.println(obj.a);
         obj.display();
    }
}
