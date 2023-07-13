import java.util.Scanner;

public class OctalToDecimal
{
	 public static void main(String[] args)
	  {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int n=scn.nextInt();
		System.out.println(decimal(n));
	  }
	 public static int decimal(int n)
	 {
		 int result=0;
		 int copy=n;
		 for(int i=0;copy>0;i++)
		 {
			 int temp=copy%10;
			 double d=Math.pow(8, i);
			 
			 result+=temp*d;
			 copy/=10;
		 }
		 return result;
	 }
}
