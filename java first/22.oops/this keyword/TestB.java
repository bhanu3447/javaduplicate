class Rectangle 
{
	int length;
	int breadth;
	void intialize(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void display()
	{
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
	}
}
class TestB
{
	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle();
		r1.intialize(40,50);
		r1.display();
	}
}
