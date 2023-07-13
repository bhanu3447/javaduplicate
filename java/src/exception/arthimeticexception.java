package exception;

import java.util.Scanner;

public class arthimeticexception
{
  public static void main(String[] args) 
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter numbers");
	int a=scn.nextInt();
	int b=scn.nextInt();
	int c=0;
	
	try 
	{
		System.out.println("try starts");
		c=a/b;
		System.out.println("try ends");
	}catch(ArithmeticException  e)
	{
		System.out.println("catch executed");
		c=a/2;
	}
	System.out.println(c);
	
  }
}
