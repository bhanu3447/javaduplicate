import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a year");
		int y=scn.nextInt();

		if ((y%400==0)||(y%4==0&&y%100!=0))
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not a leapyear");
		}
	
	}

}