//package abstractclass;
//
//abstract class A
//{
//	int i;
//	static int j=66;
//	final static int k;
//	static
//	{
//		k=100;
//	}
//	final int l;
//	{
//		l=45;
//	}
//	public A(int i)
//	{
//		this.i=i;
//	}
//	public final void display()
//	{
//		System.out.println("i="+i);
//	}
//	public static void staticmethod()
//	{
//		System.out.println(" i am static method");
//	}
//	 abstract public void m1();
//}
//class B extends A
//{
//
//	public B(int i)
//	{
//		super(i);
//	}
//	@Override
//	public void m1()
//	{
//		System.out.println("m1() defined for class B");
//	}
//}
//	
//public class abstractChances 
//{
//	public static void main(String[] args) 
//	{
//	   A a=new B(12);
//	   System.out.println(a.i);
//	   System.out.println(a.j);
//	   System.out.println(a.k);
//	   System.out.println(a.l);
//	   a.display();
//	   a.m1();
//	   A.staticmethod();
//	   
//
//	}
//
//}
