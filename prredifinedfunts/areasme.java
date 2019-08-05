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

import java.lang.Math;
class calc{
int l,b;
float r;
double s,h;
void area()
{
System.out.println("area of rectangle:");
l=10;
b=20;
System.out.println(l*b);
}

void area(float x)
{
System.out.println("area of circle:");
r=x;
System.out.println(Math.PI*r*r);
}

void area(double a,double l)
{
System.out.println("area of triangle:");
s=a;
h=l;
System.out.println(0.5*s*h);
}
}
class areaof{
 public static void main(String[] args){
 calc ob=new calc();
 ob.area(20);
 ob.area(60,20);
 
 
 }

}


