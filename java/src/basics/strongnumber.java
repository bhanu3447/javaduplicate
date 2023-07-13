package basics;

import java.util.Scanner;

public class strongnumber 
{
	public static void main(String[] args) 
	{
		   Scanner scn=new Scanner(System.in);
		   System.out.println("enter a number");
		   int num=scn.nextInt();
		   int sum=0;
		   int temp=num;
		   for(int i=1;i<=num;i++)
		   {
			   int n=i;
			   while(n>0)
			   {
				   int rem=n%10;
				   int product=1;
				   for (int j=1;j<=rem;j++)
				   {
					   product*=i;
				   }
				   sum+=product;
				   n/=10;
			   }
			   if(num==sum) System.out.println(temp);
			   
		   }
	

	}

}
