package basics;

import java.util.Scanner;

public class armstrongnumber 
{
	public static void main(String[] args) 
	{
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter a number");
	   int n=scn.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   int num=i;
		   int count=0;
		   while(num>0)
		   {
			   count++;
			   num/=10;
		   }
		   int sum=0;
		   num=i;
		   while(num>0)
		   {
			   int rem=num%10;
			   int product=1;
			   for (int j=1;j<=count;j++)
			   {
				   product*=rem;
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
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//	   int start=scn.nextInt();
//	   int end=scn.nextInt();
//	   for (int i=start;i<=end;i++)
//	   {
//	   int n;
//	if (perfect(n)) System.out.println(n);
//	   }
//	}
//public static boolean perfect(int n)
//{
//	int sum=0,i=1;
//	   while(i<n)
//	   {
//		   if (n%i==0) sum+=i;
//		   i++;
//	   }
//	return false;
//
//	}
//}
//	   
	   
	   
	 