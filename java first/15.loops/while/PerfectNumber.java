import java.util.Scanner;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("eneter a num");
		int n=scn.nextInt();
		int sum=0;
		int i=1;
	    while (i<n) //we have check excluding the number
		{
			if (n%i==0)
			{
				sum+=i;
			}
			i++;
		}
		if (sum==n)
		{
			System.out.println(n+" is a perfect number.");   
        }
		else
		{
			System.out.println(n+" is not a perfect number.");   
		}
	}
}

	 

