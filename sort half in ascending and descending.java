import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<size/2;i++)
    {
      System.out.print(arr[i]+" ");
    }
    for(int i=size-1;i>=size/2;i--)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
