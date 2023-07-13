class A
{
	static int i=1;       //static var or class var
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(A.i);
		A.i=2;
		System.out.println(A.i);
		System.out.println("main ends");
	}
}
