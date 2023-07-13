package strings;
class Circle
{
	int radius;
	Circle(int r)
	{
		radius =r;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Circle)) return false;
		return radius==((Circle)obj).radius;
	}
}
public class stringequals 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(50);
		Circle c1 = new Circle(50);
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
	}
}