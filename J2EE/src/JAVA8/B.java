package JAVA8;

public interface B extends A
{
	void m1();
	
 default void m2()
 {
	 System.out.println("default method in interface B");
 }
 static void m3()
 {
	 System.out.println("static method in interface b");
 }
}
