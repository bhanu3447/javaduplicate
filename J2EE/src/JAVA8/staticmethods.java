package JAVA8;

class Super
{
	static void m1()
	{
		System.out.println("m1() in class super");
	}
}
class Sub extends Super
{
	static void m2()
	{
		System.out.println("m1() in class sub");
	}
}
public class staticmethods
{
  public static void main(String[] args)
  {
//	Sub s= new Sub();
//	s.m1();
//	s.m2();
	  
	  Super s= new Sub();
		s.m1();
		((Sub) s).m2();
  }
}
