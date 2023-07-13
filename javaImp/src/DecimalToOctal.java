import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalToOctal
{
  public static void main(String[] args)
  {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter number");
	int n=scn.nextInt();
	System.out.println(Integer.toBinaryString(10));
	System.out.println(Integer.toOctalString(n));
	System.out.println(octal(n));
}
  public static int octal(int n)
  {
	  int octvalue=0;
	  int i=1;
	  while(n>0)
	  {
		  int rem=n%8;
		  octvalue+=rem*i;
		  n/=8;
		  i*=10;
	  }
	  return octvalue;
  }
}
