import java.util.Scanner;
class Factorial
{
	public int factor(int num)
	{
		int product=1;
		for (int i=1; i<=num;i++ ) product*=i;
		return product;
	}	
}
class StrongNumber extends Factorial
{
	public int factor(int num)     //overriding
	{
		if(num==0||num==1) return 1;
		return num*factor(num-1);
	}	
	public int Strong(int num)
	{
		int res=0;
		while(num>0)                           //for(;num>0;num/=10)
		{                                      //res+=factor(num%10);
			int rem=num%10;                     
			res+=factor(rem);
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
		System.out.println("enter a number");
		int number=scn.nextInt(); 
		if (number<0)   System.out.println("no negatives");
		else
		{
		   StrongNumber s=new StrongNumber();
		   int result=s.Strong(number);
		   if(number==result) System.out.println("Strong number");
		   else System.out.println("not a strong number");
		}
	}
}
