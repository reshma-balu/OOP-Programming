
import java.util.Scanner;
class people{
    Scanner sc=new Scanner(System.in);
    String sex,address,name;
    int age;
    people()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        address=sc.next();
        System.out.println("Gender:");
        sex=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class employ extends people{
    int empid,sal;
    String cmpny_name,qual;
    Scanner sc=new Scanner(System.in);
    employ()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        empid=sc.nextInt();
        System.out.println("Qualification:");
        qual=sc.next();
        System.out.println("Salary:");
        sal=sc.nextInt();
    }
}
class teacher extends employ{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int teachid;
    teacher(){
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teacher ID:");
        teachid= sc.nextInt();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);
        System.out.println(cmpny_name);
        System.out.println(empid);
        System.out.println(qual);
        System.out.println(teachid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(sal);
    }
}
class person
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}
