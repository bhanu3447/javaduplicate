/*import java.util.Scanner;
class Gcd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=scn.nextInt();
		int b=scn.nextInt();
		while (a%b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		System.out.println("Gcd="+b);
	}
}*/

import java.util.Scanner;
class Gcd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int gcd;
		for ( int i=1; i<=a||i<=b; i++)
		{
			if (a%i==0&&b%i==0){
				gcd=i;}
		}
		System.out.println("Gcd="+b);
	}
}

