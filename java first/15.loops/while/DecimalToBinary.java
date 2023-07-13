import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args) 
	{
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a decimal  num");
	  int  n=scn.nextInt();
	  int binary=0, i=1; 
	  while (n>0)
	  {
		  int bit=n%2;
		  binary=(bit*i)+binary;
		  n/=2;
		  i*=10;
	  }
	   System.out.println(binary);
	}
}
