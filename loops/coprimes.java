/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class  Coprimes{
    
    public class static void main(String[] args){
        
        int a=6,b=8,r;
        r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a/b;
        }
        if(b==1)
            System.out.print("these rra coprimes");
        else
            System.out.print("they rae not coprimes");
         
    }
    
}

