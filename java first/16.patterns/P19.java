import java.util.Scanner;
class P19
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int row=1; row<=2*n-1; row++ )
		{
			for (int col=1; col<=2*n; col++)
			{
		        boolean spacecond=(row<=n)?col>row&&col<2*n-row+1:col>2*n-row&&col<row+1; 
				char value=(spacecond)?' ':'*';
			    System.out.print(value);
				
			}
			System.out.println();
		}
	}
}
