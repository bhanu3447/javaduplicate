class calc
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		calc c1=new calc();
		c1.add(10,20);
		calc c2=new calc();
		c2.add(30,40);
		calc.add(10,20);
	}
}
