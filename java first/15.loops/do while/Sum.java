import java.util.Scanner;
class Sum
{
	public static void main(String[] args) 
	{
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a num");
	  int n=scn.nextInt();
	  int sum;
	  do
	  {
		  sum=0;
		  while(n>0)
		 {
			  sum+=n%10;
			  n/=10;
		  }
		  System.out.println(sum);
		  n=sum;
	  }while (sum>9);
	  
	}
}