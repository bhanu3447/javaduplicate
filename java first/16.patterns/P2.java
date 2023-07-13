/*import java.util.Scanner;
class P2
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
				if (i==1||j==1||j==n||i==n)
				{
					System.out.print("*");
			    }else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/
import java.util.Scanner;
class P2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
	    System.out.println("enter size");
		int n=scn.nextInt();

		for (int i=1; i<=n; i++)
		{
			if (i==1||i==n)
			{
			for (int j=1; j<=n; j++)
			{
					System.out.print("*");
			}
			}else {
				System.out.print("*");
				for (int j=1; j<=n-2; j++ )
				{
					System.out.print(" ");
				}
	             System.out.print("*");
			}
			 System.out.println();
		}
	}
}




		

