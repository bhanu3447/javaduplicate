/*class A 
{
	static int i;   //static variable
	
	static void m1()         //static method
	{
		System.out.println(i);     
	}
	void m2()                   //non static method
	{
		System.out.println(i);
	}
}*/


class A 
{
	static int i;   //static variable
	
	static void m1()         //static method
	{
		System.out.println(i);     
	}
	void m2()                   //non static method
	{
		System.out.println(i);
	}
	public static void main(String[]args)
	{
		m1();
	}
}

