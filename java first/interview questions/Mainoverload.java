class Mainoverload 
{
	public static void main(String args) 
	{
		System.out.println("string arg");
	}
	public static void main(int args) 
	{
		System.out.println("int arg");
	}
	public static void main(char args) 
	{
		System.out.println("char arg");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi the value is"+10);
		main("Hello");
	}
}
