package dsa;

import java.util.Scanner;

public class RecurrsionTailing_zeros 
{
  public static void main(String[] args) 
  {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=scn.nextInt();
	System.out.println(zeros(n));
  }
//  public static int factorial(int n)
//  {
//	  int product =1;
//	  for(int i=1;i<=n;i++)
//	  {
//		  product*=i;
//	  }
//	  return product;
//  }
  public static int zeros(int n)
  {
	  int count=0;
	  for(int i=5;n/i>=1;i*=5)
	  {
		  count+=n/i;
	  }
	  return count;
  }
}
