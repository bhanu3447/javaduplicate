class C
{
	static int i=20;
	static double d=6.6;
}
class D                                                    // current  class static members can be referred without the classs name
{
	public static void main(String[] args)
	{
		System.out.println(C.i);
		System.out.println(C.d);
	}
}
