
import java.util.Scanner;
class CountNoOfDigitsInNumber
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("enter a num");
		int num=scn.nextInt();
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	}
}

