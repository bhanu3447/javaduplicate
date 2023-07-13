import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String[] args) 
	{
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter a Binary  num :");
	  int binary=scn.nextInt();
	  int decimal=0, i=1;
      while (binary>0)
      {
		  decimal+=(binary%10)*i;
		  binary/=10;
		  i*=2;
      }
		  System.out.println(decimal);
	}
}
	
	  