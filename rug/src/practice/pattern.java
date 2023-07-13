package practice;

import java.util.Scanner;

public class pattern 
{
  public static void main(String[] args)
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scn.nextInt();
	
	int []arr=new int[n/2+1];
	int a=0;
	int b=1;
	for(int i=1;i<arr.length;i++)
	{
		int c=a+b;
		arr[i]=c;
		a=b;
		b=c;
	}
	
	for(int i=1;i)
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n;j++)
//		{
//			if(i==1||i==n||i+j==n+1||i==j)
//				{
//					System.out.print("*");
//				}
//			else
//				{
//				System.out.print(" ");
//				}
//		}
//		System.out.println();
//	}
//  }
}
	
	
//	enter a number
//	9
//	        *
//	       **
//	      ***
//	     ****
//	    *****
//	   ******
//	  *******
//	 ********
//	*********
//	 ********
//	  *******
//	   ******
//	    *****
//	     ****
//	      ***
//	       **
//	        *
//	for(int i=1;i<2*n;i++)
//	{
//		for(int j=1;j<=n;j++)
//		{
//			if(i<=n)
//			{
//				if(j<=n-i) System.out.print(" ");
//				else System.out.print("*");
//			}
//			else
//			{
//				if(j<=i-n) System.out.print(" ");
//				else System.out.print("*");
//			}
//		}
//		System.out.println();
//	}
//  }
//}
	
	
//	enter a number
//	10
//	*         
//	**        
//	***       
//	****      
//	*****     
//	******    
//	*******   
//	********  
//	********* 
//	**********
//	********* 
//	********  
//	*******   
//	******    
//	*****     
//	****      
//	***       
//	**        
//	*  
//    for(int i=1;i<2*n;i++)
//    {
//    	for(int j=1;j<=n;j++)
//    	{
//    		if(i<=n) 
//    		{
//    			if(j>i) System.out.print(" ");
//    			else System.out.print("*");
//    		}
//    		else 
//    		{
//    			if(j>2*n-i) System.out.print(" ");
//    			else System.out.print("*");
//    		}
//    	}
//    	System.out.println();
//    }
//  }
//}
