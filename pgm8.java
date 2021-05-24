import java. util.*;
public class Employee
{
int eNo;
String eName;
float eSalary;
public void getInput()
{
Scanner ob=new Scanner(System. in);
System. out. print("Enter the id of employee:");
eNo=ob. nextInt();
System. out. print("Enter the name of employee:");
eName=ob. nextInt();
System. out. println("Enter the salary of employee ");
eSalary=ob. nextFloat();
}
public void display()
{
System. out. println("Employee id="+eNo);
System. out. println("Employee name="+eName);
System. out. println("Employee salary="+eSalary);
}
public static void main(String args[])
{
Employee e[]=newEmployee[n]
for(int i=0;i<n;i++)
{
e[i]=newEmployee();
e[i]. getInput();
}
System. out. println("Data Entered as Below");
for(int i=0;i<n;i++)
{
e[i]. display();
}
}
}
