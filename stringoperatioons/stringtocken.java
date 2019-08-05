/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edito
 */
/**
 *
 * @author RAJI
 */
import java.util.*;
class stringtocken {
 public static void main(String[] args){
     StringTokenizer s1=new StringTokenizer("hellohaiare");
     System.out.println(s1);
     System.out.println(s1.countTokens());
     StringTokenizer s2=new StringTokenizer("hello,hai are", ",");
     System.out.println(s2.countTokens());
     System.out.println(s1.nextToken());
     System.out.println(s1.nextToken());
     System.out.println(s1.nextToken());
 
     
    }    

}
