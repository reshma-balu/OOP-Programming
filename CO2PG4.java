
import java.util.*;
abstract class publisher
{
    static int pid;
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
           System.out.println("Enter publisher details");
           System.out.println("Publiser name:");
           name=sc.next();
           System.out.println("Publiser Id:");
           pid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("Book details:");
        System.out.println("Book name");
        bname=sc.next();
        System.out.println("Book Id");
        bid=sc.nextInt();
    }
}
class literature extends book
{
    String chapter;
    int chapno;
    Scanner sc=new Scanner(System.in);
    literature()
    {System.out.println("Chapter details:");
        System.out.println("Chapter Name:");
        chapter=sc.next();
        System.out.println("Chapter number:");
        chapno=sc.nextInt();
    }
}
class fiction extends literature
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("Topic");
        topic=sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println("Publisher Name:");
        System.out.println(name);
        System.out.println("Pblisher Id:");
        System.out.println(pid);
        System.out.println("Book name:");
        System.out.println(bname);
        System.out.println("Book Id:");
        System.out.println(bid);
        System.out.println("Chapter:");
        System.out.println(chapter);
        System.out.println("Chapter Number");
        System.out.println(chapno);
        System.out.println("Topic:");
        System.out.println(topic);
    }
}
class hirerchy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].display();
        }
    }
}