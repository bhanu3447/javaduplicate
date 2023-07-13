package abstractclass;

abstract class A
{
	public void m1()    //concrete method
	{
		System.out.println("m1 defined for class A");
	}
	public abstract void m2();    //abstract method
	public abstract void m3();    //abstract method
}
class B extends A
{
	@Override
	public void m2()
	{
		System.out.println("m2() overridden");
	}
	@Override
	public void m3()
	{
		System.out.println("m3() overridden");
	}
	public void m4() //specific method
	{
		System.out.println("m4() specific method of class B");
	}
}
public class AbstractClass 
{
	public static void main(String[] args) 
	{
//		A a=new B();
//		a.m1();
//		a.m2();
//		a.m3();
//		
//		((B)a).m4();
//	
		A a=new B();
		a.m1();
		a.m2();
		a.m3();
		//a.m4();  //not accessible
		((B)a).m4();
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}
