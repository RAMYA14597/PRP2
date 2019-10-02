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
int tmp[]=new int[count];
int i,c=0;
if(count>=1 && count<=10)
{
for(i=0;i<count;i++)
{
list[i]=sc.nextInt();
}
}
for(i=0;i<count;i++)
{
if(list[i]>=0 && list[i]<=100)
{
tmp[i]=list[i];
}
else
{
c++;
}
}
Arrays.sort(tmp);
if(c==0)
{
System.out.println(tmp[count-1]);
}
}
}
