/*class E
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	static void m1(int i)
	{
		System.out.println(i);
		if (i>=3) return;
		m1(i+1);
		System.out.println("m1 ends");

	}
}*/

class E
{
	public static void main(String[] args) 
	{
		m1(1);
	}
	static void m1(int i)
	{
		if (i>=3) return;
		System.out.println(i);
		m1(i+1);
		System.out.println("m1 ends");

	}
}


