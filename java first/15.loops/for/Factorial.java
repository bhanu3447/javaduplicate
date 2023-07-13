import java.util.Scanner;
class  Fatorial
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num");
		int n=scn.nextInt();
		long product=1;
		int i;
		for (i=1; i=n; i++)
		{
			product*=i;
		}
		System.out.println(product);
		
	} 
}
