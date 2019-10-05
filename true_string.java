import java.util.*;
import java.util.Scanner;
public class true_string
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int i,tmp=0;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
{
tmp=tmp+(int)s.charAt(i);
}
}
if(tmp%8==0)
{
System.out.println("1");
}
else
{
System.out.println("0");
}
}
}
