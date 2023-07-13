package keywordsuper;

class X
{
	public void m1()
	{
		System.out.println("m1()of class A");
	}
}

class Y extends X
{
	public void m1()
	{
		super.m1();
		System.out.println("m2()of class B");
	}
}

public class SuperMethod 
{
	public static void main(String[] args)
	{
		Y y=new Y();
		y.m1();
	
	}

	
}
