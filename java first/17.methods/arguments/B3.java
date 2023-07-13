class B3
{
	public static void main(String[] args) 
	{
		m1(10);
		m1(3,5,7,8,9);
		m1(6,2);
	}
    static void m1(int... a)   //var args
	{
		for (int i=0; i<a.length; i++ )
		{
           System.out.print( a[i]+" ");
		}
		System.out.println();
	}
}


