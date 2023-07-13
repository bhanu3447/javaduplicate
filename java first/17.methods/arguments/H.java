class  H
{
	static int m1() 
	{
		int a=1;
		//return a++;
		return ++a;
	}

	public static void main(String[] args) 
	{ 
	    int i=m1();
		System.out.println("i="+i);
	}

}