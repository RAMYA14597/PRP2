import java.util.*;
import java.util.Scanner;
public class odd_print
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String N=sc.next();
int i,ch;
String res="";
if(N.length()<=100000)
{
for(i=0;i<N.length();i++)
{
ch=Character.getNumericValue(N.charAt(i));
if(ch%2!=0)
{
res=res+ch+" ";
}
}
}
if(res.length()==0)
{
System.out.println("-1");
}
else
{
System.out.println(res);
}
}
}
