class E
{
	static int i=10;
	public static void main(String[] args) 
	{
		System.out.println(i);              //refers static var of current class
		int i=20;
		System.out.println(i);              //refers local var
		System.out.println(E.i);

	}
}
