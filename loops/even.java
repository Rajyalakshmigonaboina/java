/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
public class Even {
    public static void main(String[] args){
    int n=10,i=1;
    for(i=1, i<=n; i++)
    {
        if(i%2==0)
            System.out.println("even numbers are:"+i);
        else
            System.out.println("this are not even:"+i);
    }
}
