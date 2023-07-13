
class A
{
	int i;
	int j;
	public A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public void display()
	{
		System.out.println(i+" "+j);
	}
}
class B extends A
{

	public B(int i, int j) 
	{
		super(i, j);  
		//super.i=i;
		//super.j=j;
		this.i=i;
		this.j=j;
    }
	public void show()
	{
		System.out.println(i+" "+j);
	}
}
public class constrctorchaining 
{
	public static void main(String[] args) 
	{
		B b=new B(23,45);
		b.display();
		b.show();
	}

}
