/*import java.util.Scanner;

class SumOfSquareOfAllDigits
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("enter a num");
		int num=scn.nextInt();
		int sum=0;
		int rem=0;
		while (num>0)
		{
			rem=num%10;
			sum+=Math.pow(rem,2) ;         //||sum+=(rem*rem);
			num/=10;
		}

		System.out.println(sum);
	}
}*/


import java.util.Scanner;
class SumOfSquareOfAllDigits
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("enter a num");
		int num=scn.nextInt();
		int sum=0;
		int rem=0;
		while (num>0)
		{
			rem=num%10;
			sum+=(rem*rem);
			num/=10;
		}

		System.out.println(sum);
	}
}

