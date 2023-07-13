package exception;

import java.util.Scanner;

public class trywithresource
{
  public static void main(String[] args)
  {
	try(Scanner scn=new Scanner(System.in))
	{
		System.out.println("enter a number");
	    int a=scn.nextInt();
	    System.out.println(a);
	};
//	catch(Exception e)
//	{
//		
////		throw new ArithmeticException();  //rethrowing an exceptionn
//				
//				System.out.println("handled");
//	}
// }
  }
}
