import java.util.*;
class Student
{
int Rno,Score1,Score2;
void getNumber(int N)
{
Rno=N;
System.out.println("Roll Number:"+Rno);
}
void getScore(int S1, int S2)
{
Score1=S1;
Score2=S2;
System.out.println("Scores are:Score1="+S1+"Score2="+S2);
}
}
interface Sports
{
final int S=20;
public void display();
}
class Result extends Student implements Sports
{
int Total;
public void display()
{
System.out.println("Sports="+S);
}
void read()
{
display ();
Total=Score1+Score2+S;
System.out.println("Total Score="+Total);
}
}
class Score
{
public static void main(String args[])
{
Result R=new Result();
R.getNumber(2);
R.getScore(10,11);
R.read();
}
}
