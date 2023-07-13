package interrfacce;
@FunctionalInterface
interface Z
{
	void m1();
	default void m2()
	{
		System.out.println("default implementation for all implementation");
	}
	default void m8()
	{
		System.out.println("default implementation for all implementation");
	}
	
	static void m3()
	{
		System.out.println("static method of interface");
	}
}
class B implements Z
{

	@Override
	public void m1()
	{		
		System.out.println("m1() implemented for class B");
	}
	
}
class F implements Z
{

	@Override
	public void m1()
	{		
		System.out.println("2222222 class B");
	}
	
}
public class functionalinterface
{
	public static void main(String[] args)
	{
		Z a = new B();	
		a.m1();
		a.m2();
		Z.m3();
		Z aa = new F();	
		aa.m1();
		aa.m2();
		Z.m3();
		
		
	}

}
