import java.util.Scanner;
class Factorial
{
	public int factor(int num)
	{
		int fact=1;
		for (int i=1; i<=num;i++) fact*=i;
		return fact;
	}
}
class StrongNumber extends Factorial
{
	public int Strong(int num)
	{
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=res+factor(rem);
			num/=10;
		}
		return res;
	}
}
class TestStrongNumber
{
    public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		 System.out.println("enter a num: ");
		int num=scn.nextInt();
		if (num<0)
		{
          System.out.println("no negatives");
		}
		else
		{
			StrongNumber s=new StrongNumber();
			int res=s.Strong(num);
			if (res==num)  System.out.println("Strong Number");
			else System.out.println("not a StrongNumber");
		}
	}
}
