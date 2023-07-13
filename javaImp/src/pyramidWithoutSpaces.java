import java.util.Scanner;

public class pyramidWithoutSpaces 
{
	public class pyramid 
	{
	 
	public static void main(String[] args) 
	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<2*n-i;j++)
			{
				if(j<i)System.out.print(" ");
				else System.out.println("*");
			}
			System.out.println();
		}
	  }
	}
}
