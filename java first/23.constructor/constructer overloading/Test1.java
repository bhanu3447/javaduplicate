class A 
{
	A()
	{
     System.out.println("non argument constructor");
	}
	A(int i)
	{
     System.out.println("int argument constructor");
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		new A();
		new A(10);
	}
}
