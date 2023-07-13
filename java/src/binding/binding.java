package binding;

class superclass
{
	static void print()
	{
		System.out.println("print in superclass is called");
	}

	 void print1()
	{
		System.out.println("print in superclass is called");
	}
}
class subclass extends superclass
{
	static void print()
	{
		System.out.println("print in sublass is called");
	}
    @Override
	 void print1()
	{
		System.out.println("print in subclass is called");
	}
}
public class binding 
{
	public static void main(String[] args) 
	{
		superclass a=new superclass();
		superclass b=new subclass();
		a.print();
		b.print();
		superclass a1=new superclass();
		subclass b1=new subclass();
		
		a1.print1();
		b1.print1();
		
		
	}
	


}
