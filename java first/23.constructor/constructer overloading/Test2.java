class Box
{
	int length;
	int height;
	int width;
	Box()
	{

	}
	Box(int l,int h,int w)
	{
		length=l;
		height=h;
		width=w;
	}
	Box(int d)
	{
		length=d;
		height=d;
		width=d;
	}
	void display()
	{
		System.out.println("["+length+","+height+","+width+"]");
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		Box b1=new Box();
		Box b2=new Box(3);
		Box b3=new Box(2,5,7);
		b1.display();
		b2.display();
		b3.display();
	}
}
