package override;

class A
{
	private void m1()
	{
		System.out.println("m1() of class A");
	}
}
class B
{
	//@Override
	public void m1()
	{
		System.out.println("m1() of class B");
	}
}


public class Test {

	public static void main(String[] args) 
	{
	  B b=new B();
	  b.m1();

	}

}
