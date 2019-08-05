/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class example1 {
    int a;
    void display()
    {
        System.out.print(a);
    }
    
}
class test1 {
    public static void main(String[] args){
        example1 ob=new example1();
        ob.a=30;
        ob.display();
        
    }
}
