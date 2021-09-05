
abstract class Shape
{
double length;
double breadth;
double radius;
Shape(double l,double b)
{
length=l;
breadth=b;
}
Shape(double r)
{
radius=r;
}
abstract double area();
}
class Rectangle extends Shape
{
Rectangle(double l,double b)
{
super(l,b);
}
double area()
{
System.out.println("Inside Area for Rectangle.");
return length*breadth;
}
}
class Circle extends Shape
{
Circle(double r)
{
super(r);
}
double area()
{
System.out.println("Inside Area for Circle.");
return radius*radius*3.14;
}
}
class Triangle extends Shape
{
Triangle(double l,double b)
{
super(l,b);
}
double area()
{
System.out.println("Inside Area for Triangle.");
return length*breadth*0.5;
}
}
class AbstractArea
{
public static void main(String args[])
{
Shape s;
Rectangle r=new Rectangle(2,5);
Circle c=new Circle(3);
Triangle t=new Triangle(4,8);
s=r;
System.out.println("Area is"+s.area());
s=c;
System.out.println("Area is"+s.area());
s=t;
System.out.println("Area is"+s.area());
}
}