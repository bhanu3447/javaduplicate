package non_primitive_array;

interface Car
{
	void start();
}
class Audi implements Car
{
	public void start()
	{
		System.out.println("audi starts");
	}
	public void gps()
	{
		System.out.println("audi's gps");
	}
}
class Benz implements Car
{
	public void start()
	{
		System.out.println("Benz starts");
	}
	public void sunroof()
	{
		System.out.println("benz's sunroof");
	}
}
public class demo1 
{
 public static void main(String[] args) 
 {
	Car[]a=new Car[4];
	a[0]=new Audi();
	a[1]=new Benz();
	a[2]=new Benz();
	a[3]=new Audi();
	
	for(Car c:a)
	{
		c.start();
	}
	
	for(Car c:a)
	{
	 if(c instanceof Benz) ((Benz)c).sunroof();	
	}
	
 }
}
