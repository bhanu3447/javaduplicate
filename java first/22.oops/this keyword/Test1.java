class C 
{
	int i;
	void m1()
	{
		this.m2();
	}
	void m2()
	{
		System.out.println(i);
	}
}

class Test1
{
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.i=10;
		C c2=new C();
		c2.i=20;
		c1.m1();
		c2.m1();
		c1.m2();
	}
}
