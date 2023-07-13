
package basics;
import java.util.Scanner;

public class Lcm 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int a=scn.nextInt();
		int n1=a;
		System.out.println("enter a number");
		int b=scn.nextInt();
		int n2=b;
		int n=(a>b)?a:b;
		while(n>0)
		{
		if(n%a==0&&n%b==0) break;
		n++;
		}
		System.out.println("lcm of"+a+"and"+b+"are"+n);
		
		int hcf=(n1*n2/n);
		System.out.println("hcf of"+a+"and"+b+"are"+hcf);

	}

}
