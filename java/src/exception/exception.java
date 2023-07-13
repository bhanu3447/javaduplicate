package exception;

public class exception 
{
  public static void main(String[] args) 
  {
	System.out.println("main starts");
	m1();
	System.out.println("main ends");
  }
  static void m1()
	{
		System.out.println("m1starts");
		try 
		{
			m2();
		}catch(ArithmeticException e)
		{
			System.out.println("exception handled in m1");
		}
		
		System.out.println("m1 ends");
	}
  static void m2()
	{
		System.out.println("m2 starts");
		
		int a=10/0;
		System.out.println("m2 endss");
	}
}





//public class exception 
//{
//  public static void main(String[] args) 
//  {
//	System.out.println("main starts");
//	m1();
//	System.out.println("main ends");
//  }
//  static void m1()
//	{
//		System.out.println("m1starts");
//         m2();		
//		System.out.println("m1 ends");
//	}
//  static void m2()
//	{
//		System.out.println("m2 starts");
//		try 
//		{
//			int a=10/0;
//		}catch(ArithmeticException e)
//		{
//			System.out.println("exception handled in m2");
//		}
//		System.out.println("m2 endss");
//	}
//}




























//public class exception 
//{
//  public static void main(String[] args) 
//  {
//	System.out.println("main starts");
//	m1();
//	System.out.println("main ends");
//  }
//  static void m1()
//	{
//		System.out.println("m1starts");
//		m2();
////		try 
////		{
////			m2();
////		}catch(ArithmeticException e)
////		{
////			System.out.println("exception handled in m1");
////		}
////		
//		
//		System.out.println("m1 ends");
//	}
//  static void m2()
//	{
//		System.out.println("m2 starts");
//		try 
//		{
//			int a=10/0;
//		}catch(ArithmeticException e)
//		{
//			System.out.println("exception handled in m2");
//		}
////		int a=10/0;
//		System.out.println("m2 endss");
//	}
//
//}
