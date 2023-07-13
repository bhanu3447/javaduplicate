class Rectangle 
{
	int length;
	int breadth;
	Rectangle (int l,int b)
	{
		length=l;
		breadth=b;
	}
	void display()
	{
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
	}
}
class Test3
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(10,20);
		r1.display();
	}
}
