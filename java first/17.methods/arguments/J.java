class J 
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
	public static void main(String[] args) 
	{
		System.out.println(power(3,6));
	}
}
