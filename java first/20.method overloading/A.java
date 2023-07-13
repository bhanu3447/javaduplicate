class A
{
	public static void main(String[] args) 
	{
		m1();
		m1(10);
		m1("abc");
	}
	static void m1()
	{
		System.out.println("m1()");
	}
	static void m1(int a)
	{
		System.out.println("m1(int a)");
	}
	static void m1(String b)
	{
		System.out.println("m1(String b)");
	}
}





