import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter 2 nums");
		Double a=scn.Double();
		Double b=scn.nextDouble();
		System.out.println(a+"+"+b+"="+(a+b));
	}
}