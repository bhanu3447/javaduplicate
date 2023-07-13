import java.util.Scanner;

public class pyramid 
{
 
public static void main(String[] args) 
 {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter no of lines");
	int n=scn.nextInt();
 }
}
	
//	10enter no of lines
//
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
//	int spaces=n/2;
//	int stars=1;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{  
//			System.out.print(" ");
//		}
//		
//		for(int j=1;j<=stars;j++)
//		{  
//			System.out.print("*");
//		}
//		System.out.println();
//	    if(i<n/2) 
//	    	{
//	    	spaces--;
//	    	stars++;
//	    	}
//	    else 
//	    	{
//	    	spaces++;
//	    	stars--;
//	    	}
//	}
//  }
//  }
	
//	enter no of lines
//	8
//	*
//	**
//	***
//	****
//	***
//	**
//	*

	
//	int stars=1;
//	for(int i=1;i<=n;i++)
//	{
//		
//		for(int j=1;j<=stars;j++)
//		{  
//			System.out.print("*");
//		}
//		System.out.println();
//	    if(i<n/2) stars++;
//	    else stars--;
//	}
//  }
//  }
	
	
	
//	enter no of lines
//	9
//	*********
//	 *******
//	  *****
//	   ***
//	    *
	            
//	int spaces=0;
//	int stars=n;
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
//		System.out.println();
//		
//		if(i==n)
//		{
//			stars=1;
//		}
//		else
//		{
//		stars-=2;
//		spaces++;
//		}
//	}
//  }
//  }
	
//	enter no of lines
//	8
//	* * * * * * * * 
//	 * * * * * * * 
//	  * * * * * * 
//	   * * * * * 
//	    * * * * 
//	     * * * 
//	      * * 
//	       * 
//	int spaces=0;
//	int stars=n;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=stars;j++)
//		{  
//			System.out.print("* ");
//		}
//		System.out.println();
//		spaces++;
//		stars--;
//	}
//  }
//  }
	
//	enter no of lines
//	9
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *
//
//	int spaces=n/2;
//	int stars=1;
//	for(int i=0;i<n;i++)
//	{
//		for(int j=0;j<spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=0;j<stars;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//		if(i<n/2)
//		{
//			spaces--;
//			stars+=2;
//		}
//		else
//		{
//			spaces++;
//			stars-=2;
//		}
//	}
//	
// }
// 
//}
 
	
//	enter no of lines
//	9
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
	
//	int spaces=n/2;
//	int stars=1;
//	for(int i=0;i<n;i++)
//	{
//		for(int j=0;j<spaces;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=0;j<stars;j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//		if(i<n/2)
//		{
//			spaces--;
//			stars++;
//		}
//		else
//		{
//			spaces++;
//			stars--;
//		}
//	}
//	
// }
// 
//}
// 
	
	
//	enter no of lines
//	5
//	    *
//	   ***
//	  *****
//	 *******
//	*********
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
//		System.out.println();
//		spaces--;
//		stars+=2;
//	}
//  }
//  }
	
	
//	enter no of lines
//	8
//	       * 
//	      * * 
//	     * * * 
//	    * * * * 
//	   * * * * * 
//	  * * * * * * 
//	 * * * * * * * 
//	* * * * * * * * 

      
	
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
//			System.out.print("* ");
//		}
//		System.out.println();
//		spaces--;
//		stars++;
//	}
//  }
//  }

