package coupling;

class A
{

	public void m1()
	{
		System.out.println("hkskskow");
	}
}
class B extends A
{
	public void m2()
	{
		m1();
	}
}
public class tightcoupling 
{
	public static void main(String[] args)
	{
		B b=new B();
	    b.m2();
	}
}
