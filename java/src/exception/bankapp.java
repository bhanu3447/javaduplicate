package exception;

import java.util.Scanner;

class bankapp
{
	public static void main(String[] args) 
	{
		account a1=new account(2000);
		Scanner scn=new Scanner(System.in);
		System.out.println("enter amount");
		int a=scn.nextInt();
		
		try
		{
			a1.withdraw(a);
			System.out.println("amount with drawn");
			System.out.println("ur curr bal="+a1.getbal());
		}catch(insufficientbalexception e)
		{
			System.out.println(e.getMessage());
		}
	}
}