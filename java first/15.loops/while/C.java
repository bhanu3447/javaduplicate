import java.util.Scanner;
class C
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
		while (a<=3)
		{
			System.out.println(a+"hello world");
			a++;
		}
	}
}
