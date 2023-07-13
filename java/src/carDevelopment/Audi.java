package carDevelopment;

public class Audi extends Car
{
	@Override
	public void Start() 
	{
		System.out.println("Touch start");
	}
	@Override
	public void Accelarate() 
	{
		System.out.println("Automatic drive");
	}
	@Override
	public void Stop()
	{
		System.out.println("Touch Stop");
	}
	public void bluetooth() //Specific method
	{
		System.out.println("Sony bluetooth for Audi Car");
	}

}
