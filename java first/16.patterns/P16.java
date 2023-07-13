import java.util.Scanner;
class P16
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=2*n-1; row++ )
		{
			int colcond=(row<=n)?n+row-1:3*n-row-1;

			for (int col=1; col<=colcond; col++)
			{
				boolean spacecond=(row<=n)?col<=n-row:col<=row-n;
			    char value=(spacecond)?' ':'*';
			    System.out.print(value);
			}
			System.out.println();
		}
	}
}
