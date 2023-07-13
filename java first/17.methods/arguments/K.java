class K
{
	static int power(int b,int p)
	{
		int product=1;
		for (int i=1; i<=p; i++)
		{
			product*=b;
		}
		return product;
	}
	static int len(int n)
	{
		int count=0;
	    while(n>0)
		{
			count++;
			n/=10;
		}
		return count;
	}
	static boolean isArmStrong(int n)
	{
		int num=n;
		int p=len(n);
		int sum=0;
		while(n>0)
		{
			sum+=power(n%10,p);
			n/=10;
		}
		return num==sum;
	}

	public static void main(String[] args) 
	{
		for (int i=1; i<=1000; i++)
		{
			if (isArmStrong(i))
			{
              System.out.println(i);
			}
		}
	}
}

