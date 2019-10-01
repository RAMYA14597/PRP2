import java.util.*;
import java.util.Scanner;
public class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int fact=1,i;
if(N<=20)
{
for(i=1;i<=N;i++)
{
fact=fact*i;
}
}
System.out.println(fact);
}
}
