package keywordsuper;

class C
{
	C()
	{
		System.out.println("no arg constructor of C");
	}
	C(int a)
	{
		//super();    internal call
		System.out.println("1 arg constructor of C");
	}
}
class D extends C
{
	D()
	{
		super(10);  //explicit call to parameter constructor
		System.out.println("no arg constructor of D");
	}
	D(int a)
	{
//		super(); //implicit call to no arg constructor
		System.out.println ("1 arg constructor of D");
	}
}
public class calltosuper
{

	public static void main(String[] args) 
	{
		D d=new D();
		D d1=new D(10);
      
	}

}
