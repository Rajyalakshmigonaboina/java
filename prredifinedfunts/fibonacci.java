/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class fibonacci {
    public static void main(String[] args){
        int a=0,b=1,c,i;
        for(i=a; i<=b; i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        }
    }
    
}
