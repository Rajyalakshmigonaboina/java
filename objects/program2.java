/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RAJI
 */
class test4{
int a;
test4()
{
a=100;
System.out.println(a);
}
void display(int a){
this.a=50;
System.out.println(a);
}


}
class t_p{
public static void main(String[] args){
test4 ob=new test4();
ob.display(10);


}



}