package final1;

class A
{
	public final void m1()
	{
		
	 System.out.println("class A");	
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("class B");
	}
}
public class FinalMethod{

	public static void main(String[] args)
	{
		B b=new B();
		b.m1();
		

	}

}
