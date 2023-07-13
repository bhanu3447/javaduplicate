class G
{
	static int m1() 
	{
		System.out.println("executing m1");
		return 10;
	}

	public static void main(String[] args) 
	{ 
		m1();
	    int i=m1();
		System.out.println("i="+i);
		System.out.println(m1());
		int j=m1()*20;
		System.out.println("j="+j);
	}
	
	
}
