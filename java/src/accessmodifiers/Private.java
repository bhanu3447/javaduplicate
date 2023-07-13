package accessmodifiers;

class A
{
	private int i;
	public void accessI()
	{
		System.out.println("i= "+i);
	}
}
class B extends A
{
	void access()
	{
		//System.out.println(i);        //not accessible
		accessI();
	}
}
public class Private {

	public static void main(String[] args) 
	{
		A a=new A();
		//System.out.println(a.i);
		a.accessI();
		B b=new B();
		b.access();

	}

}
