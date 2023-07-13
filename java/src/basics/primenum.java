package basics;

import java.util.Scanner;

public class primenum
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int flag=0;
		if(n<=0) System.out.println("no negatives");
		else if(n==0||n==1 ) System.out.println("not a prime");
		else 
		{
			for (int i=2;i<=n/2;i++)
			{
				if (n%i==0)
				{
					System.out.println(n+"is not a prime number");
					flag=1;
					break;
				}
			}
				if(flag==0) {
					System.out.println(n+"is a prime number");
				}
			}
		}
		
}
