import java.util.*;
import java.lang.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    double val=0;
    int flag=0;
    for(int i=2;i<n/2;i++)
    {
      if(n%i==0)
      {
        //val=Math.sqrt(n);
        flag+=1;
      }
     }
    if(flag!=1)
    	System.out.printf("%.2f",Math.sqrt(n));
    else
      	System.out.print(n+" is not a prime number.");
  }
}
