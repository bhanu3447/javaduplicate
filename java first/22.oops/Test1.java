class C 
{
	int i;
	void display()
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
		c1.display();
		c2.display();
	}
}