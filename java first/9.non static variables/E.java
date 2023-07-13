class E 
{
	static int i;
	public static void main(String[] args) 
	{
		E e1=new E();
		e1.i=10;
		System.out.println(E.i);
		System.out.println(i);
		System.out.println(e1.i);
		E e2=new E();
		e2.i=20;
		System.out.println(E.i);
		System.out.println(i);
		System.out.println(e2.i);
	}
}
