package basic;

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
public class comparision {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 1st string");
        String a=ob.nextLine();
        System.out.println("enter 2nd string");
        String b=ob.nextLine();
        int c=a.compareTo(b);
        System.out.println("result value is:"+c);
    }
}
