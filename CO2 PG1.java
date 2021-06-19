import java.util.*;
class Shape
{
int area(int a)
{
return a*a;
}
int area(int l,int b)
{
return l*b;
}
}
class Shapearea
{
public static void main(String args[])
{
int a,a1,l,l1,b,b1;
Scanner ob=new Scanner(System.in);
Shape sh=new Shape();
System.out.println("Enter Side of Square");
a1=ob.nextInt();
System.out.println("Area of Square="+sh.area(a1));
System.out.println("Enter Length and Breadth:");
l1=ob.nextInt();
b1=ob.nextInt();
System.out.println("Area of Rectangle="+sh.area(l1,b1);
