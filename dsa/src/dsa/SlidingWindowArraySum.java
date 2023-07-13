package dsa;

import java.util.Scanner;

public class SlidingWindowArraySum 
{
  public static void main(String[] args)
 {
	  int []a= {1,2,3,4,5,6,7,8,9};
	  Scanner scn=new Scanner(System.in);
	  int k=scn.nextInt();
	  int[] slidingSum = slidingSum(a, k);
	  for(int n:slidingSum)
	  {
		  System.out.println(n);
	  }
	  
 }
  public static int[] slidingSum(int a[],int k)
  {
	  int n=a.length;
	  int s[]=new int[n-k+1];
	  for(int i=0;i<=n-k;i++)
	  {
		  int sum=0;
		  for(int j=i;j<i+k;j++)
		  {
			  sum+=a[j];
		  }
		  s[i]=sum;
	  }
	return s;
  }
}