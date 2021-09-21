import java.util.Scanner;
import java.io.*;
import java.util.*;
class fillname{
String fname;
void getname(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a file name (.text):");
fname = sc.next();
}
void writefil() throws Exception{
FileOutputStream fos = new FileOutputStream(fname);
DataOutputStream dos = new DataOutputStream(fos);
dos.writeUTF("oops lab");
}
void readfil() throws Exception{
FileInputStream fis = new FileInputStream(fname);
DataInputStream dis = new DataInputStream(fis);
String str = dis.readUTF();
System.out.println(str);
}}
public class CO4PG2 {
public static void main(String args[]) throws Exception {
fillname f = new fillname();
f.getname();
f.writefil();
f.readfil();
}}