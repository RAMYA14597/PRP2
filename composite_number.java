import java.util.*;
import java.util.Scanner;
public class composite_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int i,count=0;
for(i=1;i<=N;i++)
{
if(N%i==0)
{
 count++;
}
}
if(count==2)
{
System.out.println("no");
}
else
{
System.out.println("yes");
}
}
}
