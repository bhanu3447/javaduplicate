package comparable;

class circle implements Comparable
{
	int radius;
	circle(int r)
	{
		radius=r;
	}
	@Override
	public int compareTo(Object arg) 
	{
//		int a=this.radius;
//		int b=((circle)arg).radius;
//		return a-b;
		return radius-((circle)arg).radius;
	}
	@Override
	public String toString()
	{
		return "circle[radius="+radius+"]";
		
	}
}
