package interrfacce;
interface I
{
  public final static int k=45;
  public abstract void m1();
  void m2();
  void m3();
}
class A implements I
{

	@Override
	public void m1() 
    {
	   System.out.println("m1() method for class A");	
	}

	@Override
	public void m2() 
	{
		 System.out.println("m2() method for class A");	
	}		
	@Override
	public void m3() 
	{
		System.out.println("m3() method for class A");	
	}
	
	public void m4() 
	{
		System.out.println("m4() method for class A");	
	}
}
public class interfaceexample
{
	public static void main(String[] args)
	{
		I i = new A();
		i.m1();
		i.m2();
		i.m3();
		
//		A a=(A)i;
//		a.m1();
//		a.m2();
//		a.m3();
//		a.m4();
		
		System.out.println(I.k);
		
		
//		A a = new A();
//		a.m1();
//		a.m2();
//		a.m3();
	}
	
}
