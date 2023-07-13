class A 
{
	public A()
	{
		System.out.println("no argument constructor");
	}
	public A(int a)
	{
		this();
      System.out.println("1 argument constructor");
	}
	public A(int i,int j)
	{
	  this(5);
      System.out.println("2 argument constructor");
	}
}
class calltothis
{
	public static void main(String[] args) 
	{
		A a=new A(5,6);
	}
}
