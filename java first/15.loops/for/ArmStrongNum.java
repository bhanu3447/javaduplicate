import java.util.Scanner;
class ArmStrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scn.nextInt();
		int num1=num;
		int count=0;
		while (num>0)
		{
			count++;
			num/=10;
		}
		System.out.println("len="+count);
		num=num1;
		int sum=0;
		while (num>0)
		{
			int digit=num%10;
			int product=1;
			for (int i=1; i<=count; i++ )
			{
				product*=digit;
			}
			System.out.println(digit+"pow"+count+"="+product);
			sum+=product;
			num/=10;
		}
				System.out.println("sum="+sum);
				if (sum==num1)
				{
					System.out.println(num1+"is an armstrongnum");
				}else {
                     System.out.println(num1+"is not  an armstrongnum");
				}
	}
}

		