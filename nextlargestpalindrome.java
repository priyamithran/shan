import java.io.*;
import java.util.*;

public class Main
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
long i=0;
long number=sc.nextLong();
for(i=number+1;i<=1000000;i++)
{
long temp=i;
long reverse=0;
long d=0;
while(temp>0)
{
d=temp%10;
reverse=reverse*10+d;
temp=temp/10;
}
if(reverse==i)
{
System.out.println(i);
break;
}
}
}
}
