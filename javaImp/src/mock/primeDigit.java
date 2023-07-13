package mock;

import java.util.Scanner;

public class primeDigit 
{
 public static void main(String[] args)
 {
	  Scanner Scn=new Scanner(System.in);
	  int n=Scn.nextInt();
	  
	  int sum=0;
	  while(n>0)
	  {
		  int rem=n%10;
		  if(isPrime(rem))
		  {
			  sum+=rem;
		  }
		  n/=10;
	  }
	  System.out.println(sum);
  }
 public static boolean isPrime(int n)
 {
	 for(int i=2;i<n/2;i++)
	 {
		 if(n%i==0) return false;
	 }
	 
	 return true;
 }
}
