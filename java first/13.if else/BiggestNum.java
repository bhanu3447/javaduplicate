import java.util.Scanner;
class BiggestNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 2 num");
		int a=scn.nextInt();
		int b=scn.nextInt();
		if (a>b)
		{
			System.out.println(a+"is bigger");
		}
		else if (b>a)
		{
			System.out.println(b+"is bigger");
		}
		else
		{
			System.out.println("both are same");
		}
		
	}
}