class A 
{
	int i;

	public A(int i)
	{
		this.i=i;
	}
	public A(A a)
	{
		i=a.i;
	}
	public void display()
	{
      System.out.println("i="+this.i);
	}
}
class Test
{
	public static void main(String[] args) 
	{
		A a1=new A(15);
		a1.display();

	    A a2=new A(35);
		a2.display();

		A a3=new A(a2);
		a3.display();

		A a4=new A(a1);
		a4.display();


	}
}
