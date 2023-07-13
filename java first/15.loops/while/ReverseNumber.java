import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) 
	{
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a num");
	  int n=scn.nextInt();
	  int m=0;
	  while(n>0)
      {
		  m=(m*10)+(n%10);
		  n/=10;
	  }
		System.out.println(m);
	}
}
