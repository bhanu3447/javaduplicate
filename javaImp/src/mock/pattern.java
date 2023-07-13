package mock;

import java.util.Scanner;

public class pattern
{
  public static void main(String[] args)
  {
	Scanner Scn=new Scanner(System.in);
	int n=Scn.nextInt();
	int spaces=n-1;
	int count=1;
	for(int i=1;i<=2*n-1;i++)
	{
		int num=n;
		for(int j=1;j<=spaces;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=count;k++)
		{
			System.out.print(num--);
		}
		if(i<n)
		{
			spaces--;
			count++;
		}
		else
		{
			spaces++;
			count--;
		}
		System.out.println();
		
	}
  }
}
