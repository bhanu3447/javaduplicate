

abstract class A
{
  public abstract void m1();
  public abstract void m2();
	
}
abstract class B extends A
{
	@Override
	public void m1() 
	{
		System.out.println("hi");
	}
}
class C extends B
{

	@Override
	public void m2() 
	{
		System.out.println("hello");
	}
	
}
public class abstracttest 
{
	public static void main(String[] args) 
	{
		C c = new C();
		c.m1();
		c.m2();
	}
	

}
