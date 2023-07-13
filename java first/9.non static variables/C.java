class  C
{
	int i;
	public static void main(String[] args) 
	{
		C c1=new C();
		System.out.println(c1.i);
		C c2=new C();
		c1.i=100;
		c2.i=600;
		System.out.println(c1.i);
		System.out.println(c2.i);
	
	}
}
