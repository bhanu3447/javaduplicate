class L 
{
	static void m1(int n)
	{
		n*=3;
		System.out.println("in m1 n="+n);
	}

	public static void main(String[] args) 
	{
		int n=10;
		m1(n);
		System.out.println("in main n="+n);
		m1(n);
	}
}
