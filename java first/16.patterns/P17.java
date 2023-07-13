import java.util.Scanner;
class P17
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
		        int  value=((row+col)%2==0)?1:0;
			    System.out.print(value);
			}
			System.out.println();
		}
	}
}
