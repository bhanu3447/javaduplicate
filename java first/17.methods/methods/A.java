class A
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		A.m1();        //we can also call using call name if its present in another class
		System.out.println("main ends");
	}
	
	public static void m1() 
	{
		System.out.println("m1 starts");
		m2();            //call directly because of same class
		System.out.println("m1 ends");
	}
	public static void m2() 
	{
		System.out.println("m2 starts");
		System.out.println("m2 ends");
	}

}
