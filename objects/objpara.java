/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author RAJI
 */
class raji
{
int a,b,c;
raji(raji x)
{
a=x.a;
b=x.b;
c=x.c;
}
raji(int x,int y,int z){
a=x;
b=y;
c=z; 
}
int volume()
{

return a*b*c;
}
}
class rajimain{
public static void main(String[] args){
raji p=new raji(10,20,30);
raji q=new raji(p);
int vol;
vol=p.volume();
System.out.println(vol);
vol=q.volume();
System.out.println(vol);
}    

}
