/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class Switchstmt {
    public static void main(String[] args){
        int a=10,b=3,c;
        switch ('+')
        {
            case '+':c=a+b; 
                     System.out.print(a+b);
                     break;
            case '-':c=a-b;
                     System.out.print(a-b);
                     break;
                
                
            case '*':c=a*b; 
                     System.out.print(a*b);
                     break;
            case '%':c=a%b;
                     System.out.print(a%b);
                     break;
            case '/':c=a/b; 
                     System.out.print(a/b);
                     break;
        } 
    }
    
}
