import java.util.Scanner;
class StrongNumber 
{
	public static void main(String []args)
	{
		 Scanner scn=new Scanner(System.in);
	     System.out.println("enter a num");
	     int num=scn.nextInt();
		 int temp=num;
		 int sum=0;
		 while (num>0)
		 {
			 int d=num%10;
			 int product=1;
			 for (int i=1; i<=d ;i++ )
			 {
				 product*=i;
			 }
			 System.out.println(d+"!= "+product);
			 sum+=product;
		     num/=10;
		 }
		 System.out.println("sum= "+sum);
		 if (temp==sum)
		 {
			 System.out.println(temp+"is an strong number");
		 }
		 else
		{
			 System.out.println(temp+"is not an strong number");
		}
	}
}
		











