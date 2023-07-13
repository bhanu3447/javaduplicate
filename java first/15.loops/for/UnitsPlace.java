import java.util.Scanner;
class UnitsPlace
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		while (n>0)
		{
			System.out.println(n%10 );
			n/=10;
		}
		
	}
}
