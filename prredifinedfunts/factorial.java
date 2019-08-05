/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        int i,fact=1;
        Scanner sca=new Scanner(System.in);
        System.out.print("enter number");
        int num=sca.nextInt();
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
            System.out.print(fact);
                    
                    
        }
    }
    

