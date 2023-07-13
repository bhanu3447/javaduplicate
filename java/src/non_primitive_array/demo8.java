package non_primitive_array;

class circle
{
	int radius;
	circle(int r)
	{
		radius=r;
	}
	@Override
	public String toString()
	{
		return "radius="+radius;
	}
}
public class demo8 
{
  public static void main(String[] args)
  {
	circle[]a=new circle[5];
	a[0]=new circle(50);
	a[1]=new circle(60);
	a[2]=new circle(55);
	a[3]=new circle(40);
	a[4]=new circle(30);
	
	for(circle c:a)
	{
		System.out.println(c);
	}
  }
}
