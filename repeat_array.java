import java.util.*;
import java.util.Scanner;
public class repeat_array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int K=sc.nextInt();
int arr[]=new int[N];
int i,count=0,c;
for(i=0;i<N;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<N;i++)
{
if(arr[i]==K)
{
count++;
}
}
if(count==0)
{
System.out.println("-1");
}
else
{
c=count-1;
System.out.println(c);
}
}
}
