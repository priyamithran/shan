import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=sc.nextLong();
       }
       System.out.print(sum);
   }
}
