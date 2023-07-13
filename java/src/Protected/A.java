package Protected;


class B
{
  protected int i=20;
  public void m1()
  {
  
  }
}

public class A 
{
	public static void main(String[]args)
	{
		B b=new B();
		System.out.println(b.i);
	}
}

