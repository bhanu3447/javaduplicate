/*import java.util.Scanner;
class P14
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=2*n-1; row++ )
		{
			int colcond=(row<=n)?row:2*n-row;

			for (int col=1; col<=colcond; col++)
			{
				
				System.out.print('*');
			}
			System.out.println();
		}
	}
}*/




import java.util.Scanner;
class P14
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=n; row++ )
		{
			for (int col=1; col<=row; col++)
			{
				
				System.out.print('*');
			}
			System.out.println();
		}
		for (int row=n-1; row>=1; row--)
		{
			for (int col=1; col<=row; col++)
			{
				
				System.out.print('*');
			}
			System.out.println();
		}
	}
}