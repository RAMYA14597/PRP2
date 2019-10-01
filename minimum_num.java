import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class minimum_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int i;
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]);
}
}
