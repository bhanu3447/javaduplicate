import java.util.Scanner;
class P18
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=2*n-1; row++ )
		{
			int spacecond=(row<=n)?row:2*n-row;
			for (int col=1; col<=n; col++)
			{
		        char value=(col<spacecond)?' ':'*';
			    System.out.print(value);
			}
			System.out.println();
		}
	}
}
