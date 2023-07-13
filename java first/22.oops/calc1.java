class calc1
{
	int a;
	int b;

    void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		calc1 c1=new calc1();
		c1.a=10;
		c1.b=20;
		calc1 c2=new calc1();
		c2.a=30;
		c2.b=40;
		c1.add();
		c2.add();
	}
}
