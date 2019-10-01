import java.util.*;
import java.util.Scanner;
public class reverse_word
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String S=sc.nextLine();
int i;
String out="";
if(S <=10000000)
{
String S1[]=S.split(" ");
for(i=S1.length-1;i>=0;i--)
{
out=out+S1[i]+" ";
}
System.out.print(out);
}
  else
  {
    System.out.println("limit exceed");
}
}
