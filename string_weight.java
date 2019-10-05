import java.util.*;
import java.util.Scanner;
public class string_weight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int i,tmp=0;
for(i=0;i<s.length();i++)
{
tmp=tmp+(int)s.charAt(i);
}
System.out.println(tmp);
}
}
