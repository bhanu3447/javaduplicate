class D
{
	public static void main(String[] args) 
	{
		int n=10;
		m1(n);
		float f=2.5f;
		m1(f);
		m1((double)n);
	}
	static void m1(int i) 
	{
		System.out.println("m1(int)="+i);
	}
	 static void m1(double d) 
	{
		System.out.println("m1(double)="+d);
	}
}





