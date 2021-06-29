import java. util.*;
class Complex
{
double real, img;
Complex(double r, double i)
{
this. real=r;
this. img=i;
}
public static Complex sum(Complex C1,Complex C2)
{
Complex temp=new Complex(0,0);
temp.real=C1.real+C2.real;
temp.img=C1.img+C2.img;
return temp;
}
public static void main(String args[])
{
Complex C1=new Complex(5.5,4);
Complex C2=new Complex(1.2,3.5);
Complex temp=sum(C1,C2);
System. out. println("Sum is:"+temp. real+"+"+temp. img+"i");
}
}
