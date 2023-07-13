package mock;

import java.util.Scanner;

public class isHappy 
{ 
 public static void main(String[] args) 
 {
	 Scanner Scn=new Scanner(System.in);
		int n=Scn.nextInt();
		if(isHappy(n))System.out.println(n+" is a happy number");
		else System.out.println(n+"is not a happy number");
  }
 public static boolean isHappy(int n)
 {
	 int sum=0;
	 while(n!=0)
	 {
		 int rem=n%10;
		 int product=1;
		 for(int i=1;i<=2;i++)
		 {
			 product*=rem;
		 }
		 sum+=product;
		 n/=10;
			 
	 }
	 if(sum<10&&sum==1)
	 {
		 return true;
	 }
	 else if(sum<10)
	 {
		 return false;
	 }
	 else {
		 return isHappy(sum);
	 }
 }
}
