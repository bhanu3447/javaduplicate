import java.util.Scanner;
class ListOfArmStrongNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		System.out.print("Armstrong numbers from 1 to "+n+": ");
		
		for (int i=1; i<=n; i++)
		{
		int num=i;
		int count=0;
		while (num>0){
			count++;
			num/=10;}
		int sum=0;
		num=i;
		while (num>0)
		{
			int digit=num%10;
			int product=1;
		    for (int j=1; j<=count; j++ )
			{
			product*=digit;
			}
			sum+=product;
			num/=10;
			}
				if (sum==i)
			{
				System.out.println(i);
			}
		}
	}
		
}