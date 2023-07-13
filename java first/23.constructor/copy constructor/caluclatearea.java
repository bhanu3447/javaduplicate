class Rectangle 
{
	int length;
	int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(Rectangle r2,Rectangle r1)
	{
		length=r2.length;
		breadth=r1.breadth;
	}
	public Rectangle(Rectangle r1)
	{
		this(r1,r1);
	}

   public void area()
	{
     System.out.println("length="+length);
	 System.out.println("breadth="+breadth);
	 System.out.println("area="+length*breadth);
	 System.out.println("***************************");
	}
}
class caluclatearea
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(3,7);
		r1.area();
		
		Rectangle r2=new Rectangle(8,21);
		r2.area();

		Rectangle r3=new Rectangle(r1);
		r3.area();
		
		Rectangle r4=new Rectangle(r2,r1);
		r4.area();

		Rectangle r5=new Rectangle(r4);
		r5.area();
	}
}
