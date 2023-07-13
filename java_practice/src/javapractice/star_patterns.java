package javapractice;

import java.util.Scanner;

public class star_patterns
{
//	
//	enter a number
//	8
//	* * * * * * * * 
//	* *         * * 
//	*   *     *   * 
//	*     * *     * 
//	*     * *     * 
//	*   *     *   * 
//	* *         * * 
//	* * * * * * * * 
//
//	
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=n;col++)
//		   {
//			   if(row==1||row==col||row+col==n+1||row==n||col==1||col==n)
//			   {
//				   System.out.print("* ");
//			   }
//			   else
//			   {
//				   System.out.print("  ");
//			   }
//		   }
//		   System.out.println();
//	   }
//	}
//}
	
	
//	enter a number
//	9
//	*               * 
//	  *           *   
//	    *       *     
//	      *   *       
//	        *         
//	      *   *       
//	    *       *     
//	  *           *   
//	*               * 
//
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=n;col++)
//		   {
//			   if(row==col||row+col==n+1)
//			   {
//				   System.out.print("* ");
//			   }
//			   else
//			   {
//				   System.out.print("  ");
//			   }
//		   }
//		   System.out.println();
//	   }
//	}
//}
	
	
//{
////	
////	enter a number
////	9
////	* * * * * * * * * 
////	 *             * 
////	  *           * 
////	   *         * 
////	    *       * 
////	     *     * 
////	      *   * 
////	       * * 
////	        * 
////	       * * 
////	      *   * 
////	     *     * 
////	    *       * 
////	   *         * 
////	  *           * 
////	 *             * 
////	* * * * * * * * * 
//
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int spaces=0;
//	   int stars=n;
//	   for(int row=1;row<=m;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   if(col==1||col==stars||row==1||row==m)
//			   {
//			   System.out.print("* ");
//			   }
//			   else
//			   {
//				   System.out.print("  ");
//			   }
//		   }
//		   System.out.println();
//		   if(row<=m/2)
//		   {
//			   spaces++;
//			   stars--;
//		   }
//		   else
//		   {
//			   spaces--;
//			   stars++;
//		   }
//		   
//	   }
//	}
//}
	
//	9
//	* * * * * * * * * 
//	 * * * * * * * * 
//	  * * * * * * * 
//	   * * * * * * 
//	    * * * * * 
//	     * * * * 
//	      * * * 
//	       * * 
//	        * 
//	       * * 
//	      * * * 
//	     * * * * 
//	    * * * * * 
//	   * * * * * * 
//	  * * * * * * * 
//	 * * * * * * * * 
//	* * * * * * * * * 
//
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int spaces=0;
//	   int stars=n;
//	   for(int row=1;row<=m;row++)
//	   {
//		   
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("* ");
//		   }
//		   System.out.println();
//		   if(row<=m/2)
//		   {
//			   spaces++;
//			   stars--;
//		   }
//		   else
//		   {
//			   spaces--;
//			   stars++;
//		   }
//		   
//	   }
//	}
//}
	
	
//	
//	enter a number
//	9
//	*               *
//	**             **
//	* *           * *
//	*  *         *  *
//	*   *       *   *
//	*    *     *    *
//	*     *   *     *
//	*      * *      *
//	*       *       *
//	*      * *      *
//	*     *   *     *
//	*    *     *    *
//	*   *       *   *
//	*  *         *  *
//	* *           * *
//	**             **
//	*               *
//
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int stars=0;
//	   int spaces=m;
//	   for(int row=1;row<=m;row++)
//	   {
//		  if(row<=n)
//		   {
//			   stars++;
//			   spaces-=2;
//		   }
//		  else
//		  {
//			  stars--;
//			  spaces+=2;
//		  }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   if(col==1||col==stars||row==1||row==m)
//			   {
//				  if(col!=n) System.out.print("*");
//				   
//			   }
//			   else
//			   {
//				   System.out.print(" ");
//			   }
//		   }
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   if(col==1||col==stars||row==1||row==m)
//			   {
//				   
//				   System.out.print("*");
//				   
//			   }
//			   else
//			   {
//				   System.out.print(" ");
//			   }
//		   }
//		   System.out.println();
//		   
//	   }
//	}
//}
	
	
//	
////	enter a number
////	8
////	*             *
////	**           **
////	***         ***
////	****       ****
////	*****     *****
////	******   ******
////	******* *******
////	***************
////	******* *******
////	******   ******
////	*****     *****
////	****       ****
////	***         ***
////	**           **
////	*             *
//
//	
//	
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int spaces=m;
//	   int stars=0;
//	   for(int row=1;row<=m;row++)
//	   {
//		   if(row<=n)
//		   {
//			   stars++;
//			   spaces-=2;
//		   }
//		   else
//		   {
//			   stars--;
//			   spaces+=2;
//		   }
//		   
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			    if(col!=n) System.out.print("*");
//		   }
//		   System.out.println();
//		   
//	   }
//	}
//}
	
//	5
//	enter a number
//	*****
//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	*****
//	public static void main(String[] args)
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int stars=n;
//	   int spaces=0;
//	   for(int row=1;row<=m;row++)
//	   {
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   if(row<=m/2)
//		   {
//			   stars--;
//		   }
//		   else
//		   {
//			   stars++;
//		   }
//	   }
//	   
//	}
//}
	
	
//	
//	enter a number
//	5
//	*****
//	 ****
//	  ***
//	   **
//	    *
//	   **
//	  ***
//	 ****
//	*****
//
//	public static void main(String[] args)
//	{
//	Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int stars=n;
//	   int spaces=0;
//	   for(int row=1;row<=m;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   if(row<=m/2)
//		   {
//			   stars--;
//			   spaces++;
//		   }
//		   else
//		   {
//			   stars++;
//			   spaces--;
//		   }
//		   
//	   }
//	}
//}
	
	

////
////9
////enter a number
////*
////**
////***
////****
////*****
////****
////***
////**
////*
//
//public static void main(String[] args) 
//{
//Scanner scn  = new Scanner(System.in);
//System.out.println("enter a number");
//int n=scn.nextInt();
//int stars=1;
//for(int row=1;row<=n;row++)
//{
//   
//     for(int col=1;col<=stars;col++)
//     {
//	   System.out.print("*");
//     }
//
//      System.out.println();
//      if(row<=n/2)
//	   {
//    	  stars++;
//	   }
//      else
//      {
//    	  stars--;
//      }
//}
//}
//}
//	
//	enter a number
//	9
//	        *
//	       **
//	      ***
//	     ****
//	    *****
//	     ****
//	      ***
//	       **
//	        *
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int m=2*n-1;
//	   int spaces=m/2;
//	   int stars=1;
//	   for(int row=1;row<=m;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//			   spaces--;
//			   stars++;
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars--;
//		   }
//	   }
//	}
//}
	
	
	
////	enter a number
////	11
////	     * 
////	    * * 
////	   *   * 
////	  *     * 
////	 *       * 
////	*         * 
////	 *       * 
////	  *     * 
////	   *   * 
////	    * * 
////	     * 
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int stars=1;
//	   int spaces=n/2;
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   char value=(col==stars||col==1||row==1||row==n)?'*':' ';
//			   System.out.print(value);
//			   System.out.print(" ");
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//			   spaces--;
//			   stars++;
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars--;
//		   }
//	   }
//	}
//}

//
////	enter a number
////	9
////	    *
////	   * *
////	  *   *
////	 *     *
////	*       *
////	 *     *
////	  *   *
////	   * *
////	    *
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n/2;
//	   int stars=1;
//	   
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   char value=(col==stars||col==1||row==1||row==n)?'*':' ';
//			   System.out.print(value);
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//		     spaces--;;
//		     stars+=2;;
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars-=2;
//		   }
//	   }
//	}
//}

////	9
////	enter a number
////	        * 
////	       * * 
////	      * * * 
////	     * * * * 
////	    * * * * * 
////	     * * * * 
////	      * * * 
////	       * * 
////	        * 
//
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n-1;
//	   int stars=1;
//	   
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("* ");
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//		     spaces--;
//		     stars++;
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars--;
//		   }
//	   }
//	}
//}
	
	
	
	
//	
////	enter a number
////	9
////	        *
////	       ***
////	      *****
////	     *******
////	    *********
////	     *******
////	      *****
////	       ***
////	        *
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n-1;
//	   int stars=1;
//	   
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//		     spaces--;
//		     stars+=2;
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars-=2;
//		   }
//	   }
//	}
//}
	
	
	
	
	

	
//	
////	enter a number
////	8
////	*
////	**
////	***
////	****
////	*****
////	******
////	*******
////	********
////	*******
////	******
////	*****
////	****
////	***
////	**
////	*
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   for(int row=1;row<=n;row++)
//	   {
//		
//		   for(int col=1;col<=row;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   } 
//	   for(int row=n-1;row>=1;row--)
//	   {
//		
//		   for(int col=1;col<=row;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   } 
//	}
//}
	
////enter a number
////9
////* * * * * * * * * 
//// *             * 
////  *           * 
////   *         * 
////    *       * 
////     *     * 
////      *   * 
////       * * 
////        * 
//
//public static void main(String[] args) 
//{
//	 Scanner scn  = new Scanner(System.in);
//     System.out.println("enter a number");
//     int n=scn.nextInt();
//     int spaces=0;
//     int stars=n;
//     for(int row=1;row<=n;row++)
//     {
//    	 for(int col=1;col<=spaces;col++)
//    	 {
//    		 System.out.print(" ");
//    	 }
//    	 for(int col=stars;col>=1;col--)
//    	 {
//    		 if(col==stars||col==1||row==1)
//    		 {
//    		 System.out.print("* ");
//    		 }
//    		 else
//    		 {
//    			 System.out.print("  ");
//    		 }
//    	 }
//    	 System.out.println();
//    	 stars--;
//    	 spaces++;
//    	 
//    	 
//    	 
//     }
//}
//}
	
//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=0;
//	   int stars=n;
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("* ");
//		   }
//		  System.out.println();
//		  stars--;
//		  spaces++;
//	   }
//	  
//	}
//}
	
	
	
//	
////	0
////	10
////	010
////	1010
////	01010
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	  
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=row;col++)
//		   {
//			   int value=((col+row)%2!=0)?1:0;
//			   System.out.print(value);
//		   }
//		   System.out.println();
//	   }
//	   
//	}
//}
	
	
	
////	  *
////     ***
////    *****
////   *******
////  *********
////   *******
////    *****
////     ***
////      *
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n-1;
//	   int stars=1;
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   if(row<=n/2)
//		   {
//			   spaces--;
//			   stars+=2;
//			   
//		   }
//		   else
//		   {
//			   spaces++;
//			   stars-=2;
//			  
//		   }
//	   }
//	   
//	}
//}


////enter a number
////9
////        * 
////       * * 
////      *   * 
////     *     * 
////    *       * 
////   *         * 
////  *           * 
//// *             * 
////* * * * * * * * * 
//public static void main(String[] args) 
//{
//   Scanner scn  = new Scanner(System.in);
//   System.out.println("enter a number");
//   int n=scn.nextInt();
//   int spaces=n-1;
//   int stars=1;
//   for(int row=1;row<=n;row++)
//   {
//	   for(int col=1;col<=spaces;col++)
//	   {
//		   System.out.print(" ");
//	   }
//	   for(int col=1;col<=stars;col++)
//	   {
//		   if(row==1||col==1||col==stars||row==n)
//		   {
//		   System.out.print("* ");
//		   }
//		   else
//		   {
//			   System.out.print("  ");
//		   }
//	   }
//	   System.out.println();
//	   stars++;
//	   spaces--;
//   }
//}
//}
	
	
////	    * 
////	   * * 
////	  * * * 
////	 * * * * 
////	* * * * * 
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n-1;
//	   int stars=1;
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("* ");
//		   }
//		   System.out.println();
//		   spaces--;
//		   stars++;;
//	   }
//	}
//}
	
	
	
	
	
////	*****
////	 ****
////	  ***
////	   **
////	    *
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=0;
//	   int stars=n;
//	   for(int row=1;row<=n;row++)
//	   {
//		  for(int col=1;col<=spaces;col++)
//		  {
//			  System.out.print(" ");
//		  }
//		  for(int col=stars;col>=1;col--)
//		  {
//			  System.out.print("*");
//		  }
//		  System.out.println();
//		  spaces++;
//		  stars--;
//	   }
//	}
//}
	
	
	

////    *
////   **
////  ***
//// ****
////*****
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   int spaces=n-1;
//	   int stars=1;
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=spaces;col++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int col=1;col<=stars;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   spaces--;
//		   stars++;
//		   System.out.println();
//	   }
//	}
//}
	
	
	
////	*****
////	****
////	***
////	**
////	*
//
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=n;col>=row;col--)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   }
//	}
//}

	
////	*
////	**
////	***
////	****
////	*****
//	public static void main(String[] args) 
//	{
//	   Scanner scn  = new Scanner(System.in);
//	   System.out.println("enter a number");
//	   int n=scn.nextInt();
//	   for(int row=1;row<=n;row++)
//	   {
//		   for(int col=1;col<=row;col++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//	   }
//	}
//}


	 
	 
//	 *****
//	 *****
//	 *****
//	 *****
//	 *****
//	 
//public static void main(String[] args) 
//{
//   Scanner scn  = new Scanner(System.in);
//   System.out.println("enter a number");
//   int n=scn.nextInt();
//   for(int row=1;row<=n;row++)
//   {
//	   for(int col=1;col<=n;col++)
//	   {
//		   System.out.print("*");
//	   }
//	   System.out.println();
//   }
// }
//}


}
