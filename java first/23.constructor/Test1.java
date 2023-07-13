class A
{
	A()
	{
		System.out.println("executing constructor");
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		new A();
		System.out.println("----------------");
		new A();
	}
}
