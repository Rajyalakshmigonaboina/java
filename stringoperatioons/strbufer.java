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
class strbufer {
    public static void main(String[] args){
        StringBuffer s1=new StringBuffer("hellooo");
        System.out.println(s1.append("rajii"));
        System.out.println(s1);
        System.out.println(s1.insert(2,"rai"));
        System.out.println(s1.replace(2,5,"RAJI"));   
        StringBuffer s2=new StringBuffer("helloo--");
        System.out.println(s2.substring(1,8));
        System.out.println(s1.delete(2,4));
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);
    }
}
