class A 
{
	public void m1()
	{
		System.out.println("m1 defined");
	}
}
class B
{
   public void m2()
	{
	    A a=new A();
		a.m1();
		System.out.println("m2 defined");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m2();
	}
}
