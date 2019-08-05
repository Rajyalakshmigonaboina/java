/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class rectan {
 int length;
 int breadth;
 int area;
 int perimeter;
 
  void display(int x,int y){
      
      length=x;
      breadth=y;
      
      area=length*breadth;
      System.out.println(area);
       perimeter=2*(length+breadth);
        System.out.println(perimeter);
       
  }    
    
}
class rectangle{
    public static void main(String[] args){
        rectan obj=new rectan();
        int l=10;
         int b=30;
        obj.display(l,b);
    }
    }
}
