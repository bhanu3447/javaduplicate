import java.util.Scanner;

public class pattern 
{
  public static void main(String[] args)
  {
	  Scanner scn = new Scanner(System.in);
	  int n=scn.nextInt();
 

	
//	enter number of rows
//	9
//	        * 
//	       * * 
//	      *   * 
//	     *     * 
//	    *       * 
//	   *         * 
//	  *           * 
//	 *             * 
//	* * * * * * * * * 
//
//	for(int i=1;i<=n;i++)
//	{
//		 for (int j = 1; j <= n - i; j++) {
//             System.out.print(" ");
//         }
//         
//         for (int j = 1; j <= i; j++) {
//             if (j == 1 || j == i || i == n) {
//                 System.out.print("* ");
//             } else {
//                 System.out.print("  ");
//             }
//         }
//         
//         System.out.println();
//     }	
//  }
//}
//	enter number of rows
//	10
//	*
//	**
//	***
//	****
//	***** 
//	****
//	***
//	**
//	*
//
//	int stars=1;
//	for(int i=1;i<=n;i++)
//	{
//		
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print("*");
//		}
//		if(i<n/2) stars++;
//		else stars--;
//		System.out.println();
//	}
	
	
//	enter number of rows
//	8
//	*       
//	**      
//	***     
//	****    
//	*****   
//	******  
//	******* 
//	********
//	******* 
//	******  
//	*****   
//	****    
//	***     
//	**      
//	*       
//
//	for(int i=1;i<2*n;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if(i<=n)
//					{
//					 if(j>i)
//					System.out.print(" ");
//					 else
//						 System.out.print("*");
//					}
//				else
//				{
//					if(j>2*n-i)System.out.print(" ");
//					else System.out.print("*");
//				}
//		
//			
//			}
//			System.out.println();
//		}
	
	
//	enter number of rows
//	8
//	       *
//	      **
//	     ***
//	    ****
//	   *****
//	  ******
//	 *******
//	********
//	 *******
//	  ******
//	   *****
//	    ****
//	     ***
//	      **
//	       *
//	
//	for(int i=1;i<2*n;i++)
//		{
//			
//			for(int j=1;j<=n;j++)
//			{
//				if(i<=n)
//				{
//					if(j<=n-i) System.out.print(" ");
//					else System.out.print("*");
//				}
//				else
//				{
//					if(j<=i-n) System.out.print(" ");
//					else System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
	
//	enter number of rows
//	10
//	    *
//	   **
//	  ***
//	 ****
//	*****
//	 ****
//	  ***
//	   **
//	    *
//	     
//	int stars=1;
//	int spaces=n/2-1;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print("*");
//		}
//		if(i<n/2)
//			{
//			stars++;
//			spaces--;
//			}
//		else 
//			{
//			stars--;
//			spaces++;
//			}
//		System.out.println();
//	}
	

	
//	enter number of rows
//	8
//	* * * * * * * * 
//	 * * * * * * * 
//	  * * * * * * 
//	   * * * * * 
//	    * * * * 
//	     * * * 
//	      * * 
//	       * 
//
//	int spaces=0;
//	int stars=n;
//	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//		  	System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//		spaces++;
//		stars--;
//	}
	
	
	
//	enter number of rows
//	9
//	*********
//	 *******
//	  *****
//	   ***
//	    *
//	     
//	      
//	       
//	int spaces=0;
//	int stars=n;
//	
//	for(int i=1;i<n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//		  	System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//		spaces++;
//		stars-=2;
//	}
	
//	
//	
	
	
//	enter number of rows
//	8
//	***************
//	 *************
//	  ***********
//	   *********
//	    *******
//	     *****
//	      ***
//	       *

//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=2*n-i;j++)
//		{
//			if(j<i) System.out.print(" ");
//			else System.out.print("*");
//		}
//		System.out.println();
//	}
//	
//	enter number of rows
//
//	7
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//*************
//
//	
//	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<n+i;j++)
//		{
//			if(j<=n-i)  System.out.print(" ");
//			else System.out.print("*");
//		}
//		System.out.println();
//	}
	
//	enter number of rows
//	8
//	       *
//	      ***
//	     *****
//	    *******
//	   *********
//	  ***********
//	 *************
//	***************
//
//	
//	
//	int spaces=n-1;
//	int stars=1;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print("*");
//		}
//		stars+=2;
//		spaces--;
//		System.out.println();
//	}
//  }
	
	
//	enter number of rows
//	9
//	         *
//	        * *
//	       * * *
//	      * * * *
//	     * * * * *
//	    * * * * * *
//	   * * * * * * *
//	  * * * * * * * *
//	 * * * * * * * * *
//	int spaces=n-1;
//	int stars=1;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{
//			System.out.print(" *");
//		}
//		stars++;
//		spaces--;
//		System.out.println();
//	}
//  }
	
	
	
	

  
//	enter number of rows
//	5
//	*
//	**
//	***
//	****
//	*****

//	int count=1;
//	for(int i=1;i<=n;)
//	{
//		
//		if(count<=i)                     
//		{
//			System.out.print("*");
//			count++;
//		}
//		if(count>i)
//		{
//			count=1;
//			System.out.println();
//			i++;
//			
//		}
//	}
	
//	enter number of rows
//	7
//	*******
//	******
//	*****
//	****
//	***
//	**
//	*
	int count=n;
	for(int i=1;i<=n;)
	{
		if(count>=i)
		{
			System.out.print("*");
			count--;
		}
		if(count==i)
		{
			System.out.println("*");
			i++;
			count=n;
		}
	}
//	
//	enter number of rows
//	10
//	         *
//	        **
//	       ***
//	      ****
//	     *****
//	    ******
//	   *******
//	  ********
//	 *********
//	**********

	
//	String s1=" ".repeat(n-1);
//	String s2="*".repeat(n);
//	int j=s2.length()-1;
//	for(int i=0;i<n;i++)
//	{
//		
//		System.out.println(s1.substring(i)+s2.substring(j));
//		j--;
//	}
//	
	
	
////	enter number of rows
////	7
////	*******
////	 ******
////	  *****
////	   ****
////	    ***
////	     **
////	      *
	String s1="*".repeat(n);
	String s2="";
	for(int i=0;i<=n;i++)
	{
		System.out.println(s2+s1.substring(i));
		
		s2+=" ";
	}
	
	
//	enter number of rows
//	9
//	*********
//	 *     * 
//	  *   *  
//	   * *   
//	    *    
//	   * *   
//	  *   *  
//	 *     * 
//	*********
	
//	for(int i=0;i<n;i++)
//	{
//		for(int j=0;j<n;j++)
//		{
//			
//			if(i==0||i==n-1||i+j==n-1||i==j)
//			{
//				System.out.print("*");
//			}
//			else
//			{
//				System.out.print(" ");
//			}
//			
//		}
//		System.out.println();
//	}
	
	
//	enter number of rows
//	8
//	       0
//	      1
//	     1
//	    2
//	   3
//	    2
//	     1
//	      1
//	       0

//	
	  
	  
	  int a=0;
	  int b=1;
	  
	  int ar[]=new int[n/2+1];
	  for(int i=0;i<n/2+1;i++)
	  {
		  int c=a+b;
		  ar[i]=c;
		  a=b;
		  b=c;
	  }
	  
	  int spaces=n-1;
	  int z=ar.length-1;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=1;j<=spaces;j++)
		  {
			  System.out.print(" ");
		  }
		  if(i<n/2)
		  {
			  spaces--;
			  System.out.println(ar[i]);
		  }
		  else
		  {
			  spaces++;
			  System.out.println(ar[z--]);
		  }
		  System.out.println();
		  
	  }
  }
}
//	int a=0;
//	int b=1;
//     int arr[]=new int[n/2+1];
//	for(int i=0;i<(n/2)+1;i++)
//	{
//	   int c=a+b;
//	   arr[i]=a;
//	   a=b;
//	   b=c;  
//	}
//	
//	int spaces=n-1;
//	int z=arr.length-1;
//	for(int i=0;i<n;i++)
//	{
//		for(int j=0;j<spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		if(i<n/2)
//		{
//		spaces--;
//		}
//		else
//		{
//			spaces++;
//		}
//		
//		if(i<n/2)
//		System.out.println(arr[i]);
//		else
//			System.out.println(arr[z--]);
//			
//	}
//	if(n%2==0)
//	System.out.println(" ".repeat(n-1)+arr[z]);
//  }
//}
//	

//  }
//}
