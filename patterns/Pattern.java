import java.util.Scanner;
class Pattern
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lines");
	    int n=scn.nextInt();
		int spaces=n/2;
		int letters=1;
		int a=1;
		for (int i=1; i<=n; i++ )
		{    
			for (int j=1; j<=spaces; j++ )
			{
               System.out.print(" ");
			}
			int num=a;
			for (int j=1; j<=letters ; j++)
			{
                System.out.print(num);
				if (j<=letters/2) num--;
				else num++;
			}
                System.out.println();
				if (i<=n/2)
				{
					spaces--;
					letters+=2;
					a++;
				}
				else
			{
					spaces++;
					letters-=2;
					a--;
			}
		}
	}
}