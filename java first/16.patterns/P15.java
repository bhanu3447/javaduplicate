import java.util.Scanner;
class P15
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
				char value=(row==n||col==n+row-1||col==n-row+1)?'*':' ';
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
