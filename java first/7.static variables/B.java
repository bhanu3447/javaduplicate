class B
{
	static int i=1;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		B.m1();
		B.i=100;
		B.m1();
		System.out.println("main ends");
	}
	static void m1()
	{
		System.out.println("main starts");
		System.out.println(B.i);
		System.out.println("main ends");
	}
}
