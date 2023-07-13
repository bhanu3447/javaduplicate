package javapractice;

import java.util.Scanner;

public class alphabetic_patterns 
{
	public static void main(String[] args)
	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
	 }
}
	
	
	
//	enter a number
//	8
//	         A 
//	        A B 
//	       A B C 
//	      A B C D 
//	     A B C D E 
//	    A B C D E F 
//	   A B C D E F G 
//	  A B C D E F G H 
//	 A B C D E F G H I 
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		for(int row=0;row<=n;row++)
//		{
//			for(int col=0;col<=n-row;col++)
//			{
//				System.out.print(" ");
//			}
//			for(int col=0;col<=row;col++)
//			{
//				int alphabet=65;
//				System.out.print((char)(alphabet+col)+" ");
//			}
//			System.out.println();
//		}
//	 }
//}
	
	
////	enter a number
////	8
////	A B C D E F G H I 
////	A B C D E F G H 
////	A B C D E F G 
////	A B C D E F 
////	A B C D E 
////	A B C D 
////	A B C 
////	A B 
////	A 
////	A 
////	A B 
////	A B C 
////	A B C D 
////	A B C D E 
////	A B C D E F 
////	A B C D E F G 
////	A B C D E F G H 
////	A B C D E F G H I 
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		
//		for(int row=n;row>=0;row--)
//		{
//			int alphabet=65;
//				for(int col=0;col<=row;col++)
//				{
//					System.out.print((char)(alphabet+col)+" ");
//				}
//				System.out.println();
//				
//		}
//		for(int row=0;row<=n;row++)
//		{
//			int alphabet=65;
//				for(int col=0;col<=row;col++)
//				{
//					System.out.print((char)(alphabet+col)+" ");
//				}
//				System.out.println();
//		}
//	 }
//}
	
	
	
////	enter a number
////	6
////	A 
////	B C 
////	D E F 
////	G H I J 
////	K L M N O 
////	P Q R S T U 
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		int alphabet=65;
//		for(int row=0;row<n;row++)
//		{
//			for(int col=0;col<=row;col++)
//			{
//				System.out.print((char)alphabet+" ");
//				alphabet++;
//			}
//			
//			System.out.println();
//			
//		}
//	 }
//
//}



	
//	enter a number
//	6
//	A 
//	B B 
//	C C C 
//	D D D D 
//	E E E E E 
//	F F F F F F 
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		int alphabet=65;
//		for(int row=0;row<n;row++)
//		{
//			for(int col=0;col<=row;col++)
//			{
//				System.out.print((char)alphabet+" ");
//				
//			}
//			alphabet++;
//			System.out.println();
//			
//		}
//	 }
//
//}
	
	
////	enter a number
////	5
////	A 
////	A B 
////	A B C 
////	A B C D 
////	A B C D E 
////	A B C D E F 
//
//public static void main(String[] args)
// {
//	Scanner scn = new Scanner(System.in);
//	System.out.println("enter a number");
//	int n=scn.nextInt();
//	int alphabet=65;
//	for(int row=0;row<=n;row++)
//	{
//		for(int col=0;col<=row;col++)
//		{
//			System.out.print((char)(alphabet+col)+" ");
//		}
//		System.out.println();
//	}
//}
//}
