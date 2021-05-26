import java. util.*;
class product
{
int pcode, price;
String pname;
public static void main(String args[])
{
Scanner ob=new Scanner (System.in);
product p1=new product();
product p2=new product();
product p3=new product();
System.out.println("Enter the data of p1:");
p1.pcode=sc.nextInt();
p1.pname=sc.next();
p1.price=sc. nextInt();
System.out.println("Enter the data of p2:");
p2.pcode=sc.nextInt();
p2.pname=sc.next();
p2.price=sc. nextInt();
System.out.println("Enter the data of p3:");
p3.pcode=sc.nextInt();
p3.pname=sc.next();
p3.price=sc. nextInt();
if(p1.price<p2.price && p1.price<p3.price)
System. out. println(p1.price+"is the lowest price");
else if(p2.price<p1.price && p2.price<p3.price)
System. out. println(p2.price+"is the lowest price");
else
System. out. println(p3.price+"is the lowest price");
}
}
