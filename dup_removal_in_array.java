import java.util.*;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class dup_removal_in_array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
String list[]=new String[l];
int i;
LinkedHashSet<String> ll=new LinkedHashSet<String>();
for(i=0;i<l;i++)
{
list[i]=sc.next();
}
for(i=0;i<l;i++)
{
ll.add(list[i]);
}
System.out.print(ll+" ");

}
}
