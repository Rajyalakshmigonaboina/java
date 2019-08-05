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
class inputarray {
   
  public static void main(String[] args)
  {
  Scanner ob=new Scanner(System.in);
  System.out.println("enter number of elements");
  int n=ob.nextInt();
  int arr[]=new int[n];
  System.out.println("enter elements");
  for(int i=0; i<n; i++)
  {
  arr[i]=ob.nextInt();
  }
  for(int i:arr)
  {
   System.out.println(i);
   }
 }
}