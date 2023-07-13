class A 
{
	int i;
	void display()
	{
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
}
class TestA
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		A a2=new A();
		a2.i=20;
		a1.display();
		a2.display();
	}
}
