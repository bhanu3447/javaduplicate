package javapractice;

import java.util.Scanner;

public class number_patterns
{
	public static void main(String[] args)
  {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rows you want in Pascal's Triangle: ");
        int n=scn.nextInt();
        for(int i=1;i<=5;i++)
        {
        	
        }
        
        
  }
}
        
////         1 1 
////        1 2 1 
////       1 3 3 1 
////      1 4 6 4 1 
////     1 5 10 10 5 1 
//
//        int spaces=n-1;
//        for(int row=1;row<=n;row++)
//        {
//        	int number=1;
//        	for(int col=1;col<=spaces;col++)
//        	{
//        		System.out.print(" ");
//        	}
//        	for(int col=0;col<=row;col++)
//        	{
//        		System.out.print(number+" ");
//        		number = number * (row-col) / (col + 1);
//        		
//        	}
//        	spaces--;
//        	System.out.println();
//        	
//        }
//         
//
//  }
        

//        for (int i = 0; i < numRows; i++) {
//            int number = 1;
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(number+" "); // to align the numbers
//                number = number * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }
//    }
//}
	
	
//	enter a number
//	5
//	1 2 3 4 5 
//	10 9 8 7 6 
//	11 12 13 14 15 
//	20 19 18 17 16 
//	21 22 23 24 25 
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			int num=1;
//			if(row%2!=0)
//			{
//				num=((row-1)*n)+1;
//				for(int col=1;col<=n;col++)
//				{
//					System.out.print(num+++" ");
//				}
//			}
//			else
//			{
//				 num=row*n;
//				for(int col=1;col<=n;col++)
//				{
//					System.out.print(num--+" ");
//				}
//			}
//			System.out.println();
//		}
//	 }
//}
//	


//enter a number
//3
//3 3 3 3 3 
//3 2 2 2 3 
//3 2 1 2 3 
//3 2 2 2 3 
//3 3 3 3 3 

////	enter a number
////	7
////	7 7 7 7 7 7 7 7 7 7 7 7 7 
////	7 6 6 6 6 6 6 6 6 6 6 6 7 
////	7 6 5 5 5 5 5 5 5 5 5 6 7 
////	7 6 5 4 4 4 4 4 4 4 5 6 7 
////	7 6 5 4 3 3 3 3 3 4 5 6 7 
////	7 6 5 4 3 2 2 2 3 4 5 6 7 
////	7 6 5 4 3 2 1 2 3 4 5 6 7 
////	7 6 5 4 3 2 2 2 3 4 5 6 7 
////	7 6 5 4 3 3 3 3 3 4 5 6 7 
////	7 6 5 4 4 4 4 4 4 4 5 6 7 
////	7 6 5 5 5 5 5 5 5 5 5 6 7 
////	7 6 6 6 6 6 6 6 6 6 6 6 7 
////	7 7 7 7 7 7 7 7 7 7 7 7 7 
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		int min;
//	     for(int row=1;row<=n;row++)
//		{ 
//		 //loo for upper left part 
//			for(int col=1;col<=n;col++)
//			{
//				min=row<col?row:col;
//				System.out.print(n-min+1+" ");
//			}
//			//loop for upper right part  
//			for(int col=n-1;col>=1;col--)
//			{
//				min=row<col?row:col;
//				System.out.print(n-min+1+" ");
//			}
//			System.out.println();
//		}
//	     for(int row=n-1;row>=1;row--)
//			{ 
//			 //loo for upper left part 
//				for(int col=1;col<=n;col++)
//				{
//					min=row<col?row:col;
//					System.out.print(n-min+1+" ");
//				}
//				//loop for upper right part  
//				for(int col=n-1;col>=1;col--)
//				{
//					min=row<col?row:col;
//					System.out.print(n-min+1+" ");
//				}
//				System.out.println();
//			}
//		
//	 }
//}
	
	
////	enter a number
////	8
////	11111111
////	11111122
////	11111333
////	11114444
////	11155555
////	11666666
////	17777777
////	88888888
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=n-row;col++)
//			{
//				System.out.print(1);
//			}
//			for(int col=1;col<=row;col++)
//			{
//				System.out.print(row);
//			}
//			System.out.println();
//		}
//	 }
//}
	
////	enter a number
////	6
////	1 
////	2 7 
////	3 8 12 
////	4 9 13 16 
////	5 10 14 17 19 
////	6 11 15 18 20 21 
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		
//		for(int row=1;row<=n;row++)
//		{
//			int num=row;
//			for(int col=1;col<=row;col++)
//			{
//				System.out.print(num+" ");
//				num=num+n-col;
//			}
//			System.out.println();
//		}
//	 }
//}
	
	
	
	
////	enter a number
////	9
////	123456789
////	234567891
////	345678912
////	456789123
////	567891234
////	678912345
////	789123456
////	891234567
////	912345678
//
//	public static void main(String[] args)
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=row;col<=n;col++)
//			{
//				System.out.print(col+" ");
//			}
//			for(int col=1;col<row;col++)
//			{
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
//	 }
//}
	
////	enter number
////	6
////	1 2 3 4 5 6 
////	 2 3 4 5 6 
////	  3 4 5 6 
////	   4 5 6 
////	    5 6 
////	     6 
////	    5 6 
////	   4 5 6 
////	  3 4 5 6 
////	 2 3 4 5 6 
////	1 2 3 4 5 6 
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<row;col++)
//			{
//				System.out.print(" ");
//			}
//			for(int col=row;col<=n;col++)
//			{
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
//		for(int row=n-1;row>=1;row--)
//		{
//			for(int col=1;col<row;col++)
//			{
//				System.out.print(" ");
//			}
//			for(int col=row;col<=n;col++)
//			{
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
//	 }
//}



	
////	enter number
////	9
////	9*8*7*6*5*4*3*2*1
////	9*8*7*6*5*4*3*2
////	9*8*7*6*5*4*3
////	9*8*7*6*5*4
////	9*8*7*6*5
////	9*8*7*6
////	9*8*7
////	9*8
////	9
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//			{
//				for(int col=n;col>=row;col--)
//				{
//					System.out.print(col);
//					if(col!=row) System.out.print("*");
//				}
//				System.out.println();
//			}
//		 }
//}





	
////	enter number
////	9
////	1
////	01
////	101
////	0101
////	10101
////	010101
////	1010101
////	01010101
////	101010101
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=row;col++)
//			{
//				char value=((col+row)%2==0)?'1':'0';
//				System.out.print(value);
//			}
//			System.out.println();
//		}
//	 }
//}
	




////	enter number
////	5
////	10101
////	01010
////	10101
////	01010
////	10101
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=n;col++)
//			{
//				char value=((col+row)%2==0)?'1':'0';
//				System.out.print(value);
//			}
//			System.out.println();
//		}
//	 }
//}
	







	
////	enter number
////	6
////	1
////	21
////	321
////	4321
////	54321
////	654321
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=row;col>=1;col--)
//			{
//				System.out.print(col);
//			}
//			System.out.println();
//		}
//	 }
//}
	






//	
//	enter number
//	5
//	5
//	54
//	543
//	5432
//	54321
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
////		int n=scn.nextInt();
////		int num=5;
////		for(int row=1;row<=n;row++)
////		{
////			for(int col=1;col<=row;col++)
////			{
////			  System.out.print(num--);	
////			  
////			}
////			System.out.println();
////			num=5;
////		}
////	 }
//		int n=scn.nextInt();
//		for(int row=n;row>=1;row--)
//		{
//			for(int col=n;col>=row;col--)
//			{
//			  System.out.print(col);	
//			  
//			}
//			System.out.println();
//		}
//	 }
//}







	
//	enter number
//	8
//	       1
//	      212
//	     32123
//	    4321234
//	   543212345
//	  65432123456
//	 7654321234567
//	876543212345678
//	 7654321234567
//	  65432123456
//	   543212345
//	    4321234
//	     32123
//	      212
//	       1
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=n-row;col++)
//			{
//				System.out.print(" ");
//			}
//		   for(int col=row;col>=1;col--)
//		   {
//			   System.out.print(col);
//		   }
//		   for(int col=2;col<=row;col++)
//		   {
//			   System.out.print(col);
//		   }
//           System.out.println();
//         
//		}
//		for(int row=n-1;row>=1;row--)
//		{
//			for(int col=1;col<=n-row;col++)
//			{
//				System.out.print(" ");
//			}
//			for(int col=row;col>=1;col--)
//			{
//				System.out.print(col);
//			}
//			for(int col=2;col<=row;col++)
//			{
//				System.out.print(col);
//			}
//			System.out.println();
//		}
//	 }
//}

	








	
////	enter number
////	9
////	1
////	22
////	333
////	4444
////	55555
////	666666
////	7777777
////	88888888
////	999999999
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=row;col++)
//			{
//				System.out.print(row);
//			}
//			System.out.println();
//		}
//	 }
//}












	
////	enter number
////	5
////	1 
////	2 3 
////	4 5 6 
////	7 8 9 10 
////	11 12 13 14 15 
//
//	public static void main(String[] args) 
//	 {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("enter number");
//		int n=scn.nextInt();
//		int num=1;
//		for(int row=1;row<=n;row++)
//		{
//			for(int col=1;col<=row;col++)
//			{
//				System.out.print(num++ +" ");
//			}
//			System.out.println();
//		}
//	 }
//}
				
				
				
////	enter number
////	7
////	1
////	12
////	123
////	1234
////	12345
////	123456
////	1234567
//
//public static void main(String[] args) 
// {
//	Scanner scn = new Scanner(System.in);
//	System.out.println("enter number");
//	int n=scn.nextInt();
//	for(int row=1;row<=n;row++)
//	{
//		for(int col=1;col<=row;col++)
//		{
//			System.out.print(col);
//		}
//		System.out.println();
//	}
// }
//}
