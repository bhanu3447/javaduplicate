package nonprimitivetypecasting;

class A
{
	public void m1()
	{
		System.out.println("m1() defined of class A");
	}
	public void m2()    //general method of class A
	{
		System.out.println("m2() defined of class A");
	}
	
}
class B extends A
{
    @Override
	public void m1()         //overridden method of class B
	{
		System.out.println("m1() overridden in class B");
	}
	public void m3()      //specific method of class B
	{
		System.out.println("m3() defined of class B");
		
	}
}
public class nonprimitivetypecasting
{
	public static void main(String[] args)
	{
		A a=new B();  //upcasting
//		a.m1();
//		a.m2();
//	    a.m3();  //not accessible
		
		 B b=(B)a;
		 b.m3();     //downcasting with reference
//		0((B)a).m3();   //downcasting without reference

	}

}
