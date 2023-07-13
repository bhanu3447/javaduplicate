class Rectangle 
{
	int length;
	int breadth;

    public Rectangle()
	{
		length=4;
		breadth=8;
	}
	
	public Rectangle(int num)
	{
		length=num;
		breadth=num;
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void caluclatearea()
	{
	   System.out.println("the area is: "+length*breadth);
	}
}
class Rectanglearea
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.caluclatearea();

		Rectangle r2=new Rectangle(5);
		r2.caluclatearea();

		Rectangle r3=new Rectangle(6,7);
		r3.caluclatearea();

	}
}
