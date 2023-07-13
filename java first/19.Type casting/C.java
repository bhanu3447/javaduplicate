class C
{
	public static void main(String[] args) 
	{
		int i=10;
		m1(i);      // widening of int 10 into 10.0 automaticlly done
		m1('a');    // ascii value of character a stored in double
		
	}
	static void m1(double d)
	{
		System.out.println("d="+d);
	}
}
