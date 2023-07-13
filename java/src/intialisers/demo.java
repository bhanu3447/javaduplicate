package intialisers;

 class A
{

	 {
		 System.out.println("non static block in A");
	 }
	 A()
	 {
		 System.out.println("constructor in A");
	 }
}
 class B extends A
{

	 {
		 System.out.println("non static block in B");
	 }
	 B()
	 {
		 System.out.println("constructor in B");
	 }
}
 public class demo
 {
	 public static void main(String[] args)
	 {
		new B();
	}
 }
