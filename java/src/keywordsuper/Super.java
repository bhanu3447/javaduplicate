package keywordsuper;
class A
{
	int i=10;
}
class B extends A
{
	int i=100;
	int j=45;
	public void access()
	{
		System.out.println(i);
		System.out.println(super.i);
		System.out.println(j);
	}
}


public class Super 
{
	public static void main(String[]args)
	{
		B b = new B();
		b.access();
	}

}
