import java.util.Scanner;
class P5
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}	
	}
}
