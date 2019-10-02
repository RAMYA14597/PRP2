import java.util.*;
import java.util.Scanner;
public class odd_print
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String N=sc.next();
int i;
String res="";
if(N.length()<=100000)
{
for(i=0;i<N.length();i++)
{
if(i%2!=0)
{
res=res+N.charAt(i)+" ";
}
}
}
if(N.length()==1)
{
System.out.println("-1");
}
else
{
System.out.println(res);
}
}
}
