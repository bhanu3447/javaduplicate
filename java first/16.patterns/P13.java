import java.util.Scanner;
class P13
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=n; row>0; row-- )
		{
			for (int col=0; col<=n+row-1; col++)
			{
				char value=(col<=n-row)?' ':'*';
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
