import java.util.*;
import java.util.Scanner;
public class basic_oper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d,res;
d=a*b;
res=d%c;
System.out.println(res);
}
}
