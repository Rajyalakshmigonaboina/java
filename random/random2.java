/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
import java.util.*;
class random{
 public static void main(String[] args){
Random ob1= new Random(200);
Random ob2= new Random(300);
int a=ob1.nextInt(200);
int b=ob2.nextInt(200);
System.out.println(a);
System.out.println(b);
for(int i=a; i<=b; i++){
    System.out.println(i);
   }

 }
}