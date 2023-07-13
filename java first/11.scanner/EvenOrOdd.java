import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		if (n%2==0)
		{
			System.out.println(n+"is an even number");
		}
		else
		{
			System.out.println(n+"is an odd number");
		}

	}
}
