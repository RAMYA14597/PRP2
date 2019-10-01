import java.util.*;
import java.util.Scanner;
public class num_check_array
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
System.out.println("no");
}
else
{
System.out.println("yes");
}
}
}
