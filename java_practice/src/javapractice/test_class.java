package javapractice;


/*
 ************************inner class types********************

1.member inner class ---->a class created within class and outside method

2.anonymous class  ------>a class created for extending an interface or extending class .the java compiler decides its name

3.local inner class ----->a class created for within method

4.static nested class---->a static class created within the class

5.nested interface  ----->a interface created within a class or interface

*/




/*access member of non static inner class */



//class outer_class
//{
//  int a;
//  static int b;
//   class inner_class
//  {
//	  int c;
//	  public void m1()
//	  {
//		  System.out.println("this is m1() in inner class");
//	  }
//	  public static void m2()
//	  {
//		  System.out.println("this is m2() in inner class");
//	  }
//  }
//}
//public class test_class
//{
//	public static void main(String[] args) 
//	{
//		outer_class oc = new outer_class();
//		inner_class ic = oc.new inner_class();
//		System.out.println(oc.a);
//		System.out.println(oc.b);
//		ic.m1();
//		System.out.println(ic.c);
//		ic.m2();
//	}
//}



/*access member of static inner class*/



//class outer_class
//{
//  int a;
//  static int b;
//   static class  inner_class
//  {
//	  int c;
//	  public void m1()
//	  {
//		  System.out.println("this is m1() in inner class");
//	  }
//	  public static void m2()
//	  {
//		  System.out.println("this is m2() in inner class");
//	  }
//  }
//}
//public class test_class
//{
//	public static void main(String[] args) 
//	{
//		/*using outer class nonstatic__static*/
//
//		outer_class oc = new outer_class();
//		System.out.println(oc.a);
//		System.out.println(outer_class.b);
//		
//		/*using inner class nonstatic__static*/
//		
//		outer_class.inner_class.m2();
//		inner_class ic = new inner_class();
//		ic.m1();
//		System.out.println(ic.c);
//		
//		
//	}
//}






/********** non staic inner class ***********/



/*member inner class*/
 
//class outer_class
//{
//  private int data=30;
//  void display()
//  {
//	  class inner_class
//	  {
//		  void message()
//		  {
//			  System.out.println(data);
//		  }
//	  }
//		  inner_class ic = new inner_class();
//		  ic.message();
//	  }
//}
//public class test_class
//{
//	public static void main(String[] args) 
//	{
//		outer_class oc = new outer_class();
//		oc.display();
//	}
//}



/*nested interface*/



//interface outer_class
//{
//	void show();
//	interface inner_class
//	{
//		void message();
//	}
//}
//public class test_class implements outer_class.inner_class
//{
//	@Override
//	public void message()
//	{
//		System.out.println("impl in message");
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		outer_class.inner_class  i=new test_class();
//		i.message();
//		
//	}
//	
//}





/*class inside interface*/



//class outer_class
//{
//	interface inner_class
//	{
//		void message();
//	}
//}
//public class test_class implements outer_class.inner_class
//{
//	@Override
//	public void message()
//	{
//		System.out.println("impl in message");
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		outer_class.inner_class  i=new test_class();
//		i.message();
//		
//	}
//	
//}

