package Algorithms;

import java.util.Scanner;

public class linear_search 
{
  public static void main(String[] args)
  {
//	Scanner scn=new Scanner(System.in);
//	System.out.println("enter a array");
	int[]a= {5,8,12,26,38};
	System.out.println(search(a,8));
	System.out.println(search(a,29));
	
  }
  public static int search(int[]a,int x)
  {
	  for(int i=0;i<a.length;i++)
	  {
		  if(x==a[i]) return i;
	  }
	return -1;
  }
	
}
