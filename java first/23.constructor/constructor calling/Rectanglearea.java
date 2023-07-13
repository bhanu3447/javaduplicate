class Rectangle 
{
	int length,breadth;

	public Rectangle(int n)
	{
		this(n,n);
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
     System.out.println("The area is: "+length*breadth);
	}
}
class Rectanglearea
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(5,4);
		r1.area();
		Rectangle r2=new Rectangle(8);
		r2.area();
	}
}
