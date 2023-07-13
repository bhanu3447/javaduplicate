class A 
{
	public void m1()
	{
		System.out.println("Good logic");
	}
}
class B
{
	public void m2(A a)
	{
		a.m1();
		//new A().m1();
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.m2(new A());
	}
}
