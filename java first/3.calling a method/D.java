public class D
{
	public static void main(String[]args)
	{
		System.out.println("main starts");
		D.m1();
		D.m1();
		System.out.println("main ends");
	}
	public static void m1()
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}
}