import java.util.Scanner;
class Lcm 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=scn.nextInt();
		System.out.println("enter a num");
		int b=scn.nextInt();
		
		int n=a>b?a:b;                                //with out using if else

		while (true)
		{
			if (n%a==0&&n%b==0) break;
			n++;
		}

		 System.out.println("lcm of"+a+"and"+b+"is"+n);
	}
}
