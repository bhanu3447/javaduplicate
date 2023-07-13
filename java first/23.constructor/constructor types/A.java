class A 
{
	int i=10;
}
class test
{
	public static void main(String[] args) 
	{
		System.out.println(new A().i);
		new A();
		A a1=new A();
		System.out.println(a1.i);

	}
}
