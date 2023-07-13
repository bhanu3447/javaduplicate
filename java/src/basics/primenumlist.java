package basics;

import java.util.Scanner;
public class primenumlist
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int start =scn.nextInt();
		int end=scn.nextInt();
		for (int i=start; i<=end; i++)
		{
			int flag=0;
			for (int j=2;j<=i/2; j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0) System.out.println(i);
		}
	}
}
				