import java.util.Scanner;
class  Fibonacci
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		int a=0,b=1, c;
		for (int i=1; i<=n ; i++)
		{
			c=a+b;
			System.out.println(c);
	        a=b;
			b=c;
		}
	}
}
