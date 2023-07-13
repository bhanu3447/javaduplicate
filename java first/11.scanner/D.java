import java.util.Scanner;
class D
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 2 nums");
		Float a=scn.nextFloat();
		Float b=scn.nextFloat();
		System.out.println(a+b);
		System.out.println(a+"+"+b+"="+(a+b));
	}
}