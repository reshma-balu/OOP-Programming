import java.util.*;
class Symmetric
{
public static void main(String args[])
{
int a[][]=new int[20][20];
int b[][]=new int[20][20];
int m,n,i,j;
int count=0;
System.out.println("Enter rows and columns of matrix");
Scanner ob=new Scanner(System.in);
System.out.println("Enter order of matrix");
m=ob.nextInt();
n=ob.nextInt();
if(m==n)
{
System.out.println("Enter number of matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=a[j][i];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]==b[i][j])
count=count+1;
}
}
if(count==(m+n))
System.out.println("Symmetric");
else
System.out.println("Not Symmetric");
}
else
System.out.println("Not Square Matrix");
}
}