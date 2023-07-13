import java.util.Scanner;
class  EvenOrOdd2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		if ((n&1)==0)
		{
			System.out.println(n+"is an even number");
		}
		else
		{
			System.out.println(n+"is an odd number");
		}
	}

}
