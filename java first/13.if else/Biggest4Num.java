import java.util.Scanner;
class Biggest4Num
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first num");
		int a=scn.nextInt();
        System.out.println("enter the second num");
		int b=scn.nextInt();
		System.out.println("enter the third num");
		int c=scn.nextInt();
		System.out.println("enter the fourth num");
		int d=scn.nextInt();
		if (a>b&&b>c&&c>d)
		{
			System.out.println(a+"is the largest number");
		}
		else if (b>c&&b>d&&b>a)
		{
			System.out.println(b+"is the largest number");
		}
		else if (c>a&&c>b&&c>d)
		{
			System.out.println(c+"is the largest number");
		}
		else
		{
			System.out.println(d+"is the largest number");
		}
		
	}
}