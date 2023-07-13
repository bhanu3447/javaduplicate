package instanceofkeyword;
class A
{
}
class B extends A
{	
}
public class InstanceOf 
{
	public static void main(String[]args)
	{
	  A a = new A();
	  System.out.println("class A");
	  System.out.println(a instanceof Object);
	  System.out.println(a instanceof A);
	  System.out.println(a instanceof B);
	  System.out.println("*****************");
	                                                        //checking whether the object belongs to the class or not
	  B b=new B();
	  System.out.println("class B");
	  System.out.println(b instanceof Object);
	  System.out.println(b instanceof A);
	  System.out.println(b instanceof B);
	  System.out.println("*******************");
	  
	  Object obj=new Object();
	  System.out.println("class Object");
	  System.out.println(obj instanceof Object);
	  System.out.println(obj instanceof A);
	  System.out.println(obj instanceof B);
	  System.out.println("*******************");
	  
	  A a1=new B();
	  System.out.println("upcasting");
	  System.out.println(a1 instanceof Object);
	  System.out.println(a1 instanceof A);
	  System.out.println(a1 instanceof B);
	  System.out.println("*******************");
	  
	
	}
		
}