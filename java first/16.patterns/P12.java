import java.util.Scanner;
class P12
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=n; row++ )
		{
			for (int col=1; col<=n+row-1; col++)
			{
				char value=(col<=n-row)?' ':'*';
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
