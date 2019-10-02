import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class largest_array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=sc.nextInt();
int list[]=new int[count];
int i;
for(i=0;i<count;i++)
{
list[i]=sc.nextInt();
}
Arrays.sort(list);
System.out.println(list[count-1]);
}
}
