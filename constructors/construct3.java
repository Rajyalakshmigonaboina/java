/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 * */
 class construct3 
{
    static int a=10;
    static int b;
    
   static void print()
    {
    System.out.println(a);
     System.out.println(b);
    }
   static{
    System.out.println("statics");
    b=a*20;
   }
public static void main(String[] args){
System.out.println("main");
print();
}

}
