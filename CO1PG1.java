import java.util.*;
class SearchArray
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,search,flag=0;
System.out.println("Enter number of elements:");
n=in.nextInt();
int[] a=new int[n];
System.out.println("Enter the elements:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("Enter the element to be searched:");
search=in.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==search)
{
System.out.println("Element"+search+" found at "+i+" position");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Element"+search+"not found");
}
}
}
  