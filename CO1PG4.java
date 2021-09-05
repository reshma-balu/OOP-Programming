import java.util.*;
class matrixaddition
{
public static void main(String args[])
{
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:");
m=sc.nextInt();
System.out.println("Enter number of columns:");
n=sc.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("Enter elements of first matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
System.out.println();
}
}
System.out.println("Enter elements of second matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
System.out.println();
}
}
for(i=0;i<m;i++)
for(j=0;j<n;j++)
c[i][j]=a[i][j]+b[i][j];
System.out.println("Sum of Two Matrices:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.println(c[i][j]+"\t");
System.out.println();
}
}
}
