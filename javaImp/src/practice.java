import java.util.Scanner;

public class practice 
{
	
}
//	public static void main(String[] args)
//	  {
//		  Scanner scn=new Scanner(System.in);
//		  System.out.println("enter first number");
//		  int start=scn.nextInt();
//		  System.out.println("enter  last number");
//		  int last=scn.nextInt();
//		  
//		  for(int i=start;i<=last;i++)
//		  {
//			  if(strong(i))System.out.println(i);
//		  }
//		  
//	  }
//	   
//	public static boolean strong(int n)
//	{
//		int temp=n;
//		int sum=0;
//		while(n>0)
//		{
//			int rem=n%10;
//			int product=1;
//			
//			for(int i=1;i<=rem;i++)
//			{
//				product*=i;
//			}
//			sum+=product;
//			n/=10;
//		}
//		if(sum==temp) return true;
//		return false;
//		
//	}
//	
//	
//}
      ////**** list of happy number ****////


//	public static void main(String[] args)
//	  {
//		  Scanner scn=new Scanner(System.in);
//		  System.out.println("enter first number");
//		  int start=scn.nextInt();
//		  System.out.println("enter  last number");
//		  int last=scn.nextInt();
//		  
//		  for(int i=start;i<=last;i++)
//		  {
//			  if(isPrime(i))System.out.println(i);
//		  }
//		  
//	  }
//	   
//	public static boolean isPrime(int n)
//	{
//		for(int i=2;i<n/2;i++)
//		{
//			if(n%i==0) return false;
//		}
//		return true;
//	}
//	
//	
//}


        ////**** happy number ****////

//	 public static void main(String[] args)
//	  {
//		  Scanner scn=new Scanner(System.in);
//		  System.out.println("enter a number");
//		  int n=scn.nextInt();
//		  if(isHappy(n)) System.out.println("happy number");
//		  else System.out.println("not a happy number");
//	  }
//		
//	 public static boolean isHappy(int n)
//	 {
//		 int sum=0;
//		 while(n>0)
//		 {
//			int digit= n%10;
//			sum+=digit*digit;
//			n/=10;
//		 }
//		 if(sum<10&&sum==1) 
//			 {
//			 return true;
//			 }
//		 else if(sum<10) 
//			 {
//			 return false;
//			 }
//		 else 
//			 {
//			 return  isHappy(sum);
//			 }
//		
//	 }
//}
		
	


////**** fibonacci ****////

//  public static void main(String[] args)
//  {
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  if(isHappy(n)) System.out.println("happy number");
//	  else System.out.println("not a happy number");
//  }
//	 public static boolean isHappy(int n)
//	 {
//		 int sum;
//		 do
//		 {
//			 sum=0;
//			 while(n>0)
//			 {
//				int digit=n%10;
//				sum+=digit*digit;
//				n/=10;
//			 }
//			
//			 if(sum<10&&sum==1) return true;
//			 n=sum;
//		 }while(n>=10);
//		return false;
//	 }
//		  
//  }
// 
  
  
  ////*** sum of number until less than 9******////

//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  
//	  int sum;
//	  do
//	  {
//		  sum=0;
//		  while(n>0)
//		  {
//			  sum+=n%10;
//			  n/=10;
//		  }
//		  System.out.println(sum);
//		  n=sum;
//	  }while(sum>9);
//		  
//  }
//}
  
     ////*** evensum oddsum******////
  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  int evenSum=0;
//	  int oddSum=0;
//	  while(n>0)
//	  {
//		  int rem=n%10;
//		  if(rem%2==0) evenSum+=rem;
//		  else oddSum+=rem;
//		 
//		  n/=10;
//	  }
//	  System.out.println(evenSum);
//	  System.out.println(oddSum);
//  }
//}
	  
	////**** palindrome ****////
	  
	  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  int sum=0;
//	  while(n>0)
//	  {
//		  sum+=n%10;
//		  n/=10;
//	  }
//	  System.out.println(sum);
//  }
//}
  
        ////**** palindrome ****////
  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  int num=n;
//	  int reverseNumber=0;
//	  while(n>0)
//	  {
//		 reverseNumber=(reverseNumber*10)+(n%10);
//		 n/=10;
//	  }
//	  if(reverseNumber==num) System.out.println("is a palindrome");
//	  else System.out.println("not a palindrome");
//  }
//}
 
         ////**** reversenumber ****////

//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  int reverseNumber=0;
//	  while(n>0)
//	  {
//		 reverseNumber=(reverseNumber*10)+(n%10);
//		 n/=10;
//	  }
//	  System.out.println(reverseNumber);
//  }
//}
	  
  
      ////**** units place ****////
  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n=scn.nextInt();
//	  while(n>0)
//	  {
//		 System.out.println(n%10); 
//		 n/=10;
//	  
//	  }
//  }
//}
	  
	  
	  
	  
	  ////***leap year*****/
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a year");
//	  int year=scn.nextInt();
//	  System.out.println("enter a month");
//	  int month=scn.nextInt();
//	  
//	   switch(month)
//	   {
//	   case 1:
//	   case 3:
//	   case 5:
//	   case 7:
//	   case 8:
//	   case 12: System.out.println("31 days"); break;
//	   case 4:
//	   case 6:
//	   case 9:
//	   case 11:
//	   case 10:System.out.println("30 days"); break;
//	   case 2:if(year%400==0||year%100!=0&&year%4==0) System.out.println("29 days");
//	   else System.out.println("28 days");
//		   
//	   }
	  
	  
	////***gcd normal while***////
	  
	  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n1=scn.nextInt();
//	  System.out.println("enter a number");
//	  int n2=scn.nextInt();
//	  
//	  int a=n1;
//	  int b=n2;
//	  
//	  while(n1%n2!=0)
//	  {
//		  int rem=n1%n2;
//		  n1=n2;
//		  n2=rem;
//	  }
//	  int gcd=n2;
//          
//	  System.out.println("gcd of "+a+"and "+b+"are :"+gcd);
//	  
//	  int lcm=n1*n2/gcd;
//	  System.out.println("lcm of "+a+"and "+b+"are :"+lcm);
	  
	  
	  
	  ////***lcm normal while***////
	  
	  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a number");
//	  int n1=scn.nextInt();
//	  System.out.println("enter a number");
//	  int n2=scn.nextInt();
//	  
//	  int lcm=(n1<n2)?n1:n2;
//	  
//	  while(true)
//	  {
//		  if(n1%lcm==0&&n2%lcm==0) break;
//		  lcm++;
//	  }
//          
//	  System.out.println("lcm of "+n1+"and "+n2+"are :"+lcm);
//	  
//	  int gcd=n1*n2/lcm;
//	  System.out.println("gcd of "+n1+"and "+n2+"are :"+gcd);
  
  
	  
	  ////***binary to decimal***////
	  
//	  Scanner scn=new Scanner(System.in);
//  System.out.println("enter a number");
//		int binary=scn.nextInt();
//		int i=1;
//		int decimal=0;
//		while(binary>0)
//		{
//			int rem=binary%10;
//			decimal+=rem*i;
//			i*=2;
//			binary/=10;
//		}
//		System.out.println(decimal);
		
		
	  ////***decimal to binary/***///
		
//	Scanner scn=new Scanner(System.in);
//  System.out.println("enter a number");
//	int decimal=scn.nextInt();
//	int binary=0;
//	int i=1;
//	while(decimal>0)
//	{
//		int rem=decimal%2;
//		binary+=i*rem;
//		decimal/=2;
//		i*=10;
//	}
//	System.out.println(binary);
//	
//  }
//}
