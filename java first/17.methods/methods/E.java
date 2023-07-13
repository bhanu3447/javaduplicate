class E
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		m1();
		m2();
		m3();
		m4();
		System.out.println("main ends");
	}
	
	public static int m1() 
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
		//return 200;
		int a=10;
		return a;
	}
	public static String m2() 
	{
		System.out.println("m2 starts");
		System.out.println("m2 ends");
		return "abc";
	}
	public static double m3() 
	{
		System.out.println("m3 starts");
		System.out.println("m3 ends");
		return 10.6;
	}
	public static float m4() 
	{
		System.out.println("m4 starts");
		System.out.println("m4 ends");
		return 10.6f;               //conversion of double to float
	}
}