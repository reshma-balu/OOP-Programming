import java.util.*;
class data
{  
public static void main(String args[])
{
int i,n,search,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements:") ;
n = sc.nextInt();
int a[]= new int[n];
System.out.println("Enter the elements") ;
for(i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter the element to be seached");
search = sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==search)
{
System.out.println("Element "+search+" found at "+i+" position");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Element "+search+" not found");
}
}
}
