
import java.util.Scanner;
class CountNoOfDigitsEvenOdd
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
        System.out.println("enter a num");
		int num=scn.nextInt();
		int zerocount=0;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			if (num%10==0)
			{
				zerocount++;
			}
			else if(num%2==0)
			{
				evencount++;
			}
			else
			{
					oddcount++;
			}
			num/=10;
		}
		System.out.println("zero:"+zerocount);
		System.out.println("even:"+evencount);
		System.out.println("odd:"+oddcount);
	}
}

