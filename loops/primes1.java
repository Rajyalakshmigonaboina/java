/*
 * To c0hange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class Primes1{
    public static void main(String[] args){
        int c=0;
        for( int i=1; i<=100; i++){
            for( int j=2; j<=i-1; j++){
                if(i%j==0)
                {
                    c=c+1;
                }
            }
                if(c==0)
                {
                System.out.println(i);
                }
                else{
                    c=0;
                }
        
            
            
    }
    
}
