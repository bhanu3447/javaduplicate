import java.util.Scanner;
class ListOfPrimeNum
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num");
		int n=scn.nextInt();
		System.out.println("prime nums b/w 1 and"+n+"are: ");
        int count=0;
		for (int i=1; i<=n; i++)
		{
			if (i<=1) continue;
				boolean flag=true;
			for (int j=2; j<=2; j++ ){
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				count++;
				System.out.println(i);
			}
	   }
			System.out.println(count+"prime nums are exist");
	}
}