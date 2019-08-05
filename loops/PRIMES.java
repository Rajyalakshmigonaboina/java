/*
 * To c0hange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class Primes{
    public static void main(String[] args){
        int i,j,n=100;
        for(i=0; i<=100; i++){
            for(j=0; j<=100; j++){
                if(i%j==0)
                    System.out.println(i);
            }
        }
    }
    
}
