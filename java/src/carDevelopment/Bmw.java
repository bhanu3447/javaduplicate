package carDevelopment;

public class Bmw extends Car 
{
	@Override
	public void Start() 
	{
		System.out.println("Button start");
	}
	@Override
	public void Accelarate() 
	{
		System.out.println("Full clutch drive");
	}
	@Override
	public void Stop()
	{
		System.out.println("Button Stop");
	}
	public void bluetooth() //Specific method
	{
		System.out.println("Jbl bluetooth for Bmw Car");
	}
}
