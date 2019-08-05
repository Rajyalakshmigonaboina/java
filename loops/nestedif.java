/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class Nestedif {
    public static void main(String[] args){
        int a=10,b=12,c=9;
        if(a>b){
            if(a>c)
                System.out.print("a is greater than b and c");
        }
        else{
            if((b>a)&&(b>c))
                System.out.print("b is greater than a and c");
            else
                System.out.print("c is greater than a and b");
                
        }
    }
    
}
