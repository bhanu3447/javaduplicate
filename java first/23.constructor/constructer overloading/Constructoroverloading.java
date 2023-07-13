class D
{
	int i;
	int j;

	public D()
	{
		i=45;
		j=55;
	}

	public D(int num)
	{
		this.i=num;
		this.j=num;
	}

	public D(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public void display()
	{
		System.out.println(i+" "+j);
	}

}
class Constructoroverloading
{
	public static void main(String[] args) 
	{
		D d1=new D();
		d1.display();

		D d2=new D(100);
		d2.display();

        D d3=new D(88,99);
		d3.display();

		D d4=new D(111,222);
		d4.display();
		
	}
}
