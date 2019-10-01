import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class min_and_max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
int i;
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
if(N<=100000)
{
Arrays.sort(a);
System.out.println(a[0]+" "+a[N-1]);
}
}
}
