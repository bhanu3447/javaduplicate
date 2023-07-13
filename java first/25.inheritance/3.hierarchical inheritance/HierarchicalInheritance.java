class A 
{
	int i=34;
	public void displayA()
	{
		System.out.println("i="+i);
	}
}
class B extends A
{
	int j=100;
	public void displayB()
	{
		System.out.println("j="+j);
	}
}
class C extends A
{
	int k=55;
	public void displayC()
	{
		System.out.println("k="+k);
	}
}
class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
        B b=new B();
        System.out.println(b.i);
	    System.out.println(b.j);
		b.displayA();
		b.displayB();
		C c=new C();
        System.out.println(c.i);
		System.out.println(c.k);
		c.displayA();
		c.displayC();
	}
}
