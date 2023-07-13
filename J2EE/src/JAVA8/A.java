package JAVA8;

public interface A 
{
	void m1();
//	default boolean equals(Object a)
//	{
//		return false;
//		
//	}
  default void m2()
  {
	  System.out.println("default method in interface A");
  }
  static void m3()
  {
 	 System.out.println("static method in interface A");
  }
  
}
