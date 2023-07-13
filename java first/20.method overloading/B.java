class B
{
	public static void main(String[] args) 
	{
		System.out.println("main(string[] args)");
		main();
		main("abc");
		main(10);
		
	}
	public static void main() 
	{
		System.out.println("main()");
	}
	public static void main(String a) 
	{
		System.out.println("main(string)");
	}
	public static void main(int a) 
	{
		System.out.println("main(int)");
	}
	
}





