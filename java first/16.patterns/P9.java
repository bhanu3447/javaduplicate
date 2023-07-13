import java.util.Scanner;
class P9
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter size");
		int n=scn.nextInt();
		for (int i=1; i<=n; i++ )
		{
			if (i%2!=0)
			{
				int num=((i-1)*n)+1;
				for (int j=1; j<=n; j++ )
				{
					System.out.print(num+"\t");
						num++;
				}
			
			}else {
				int num=i*n;
				for (int j=1; j<=n; j++ )
				{
					System.out.print(num+"\t");
					num--;
				}
				
			}
			System.out.println();
		}
	}
	
}
