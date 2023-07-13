package carDevelopment_abstract;

 public class Driver 
{

	public void drive(Car car)
	{
       car.Start();
       car.Accelarate();
       car.Stop();
	}
	public void accessBluetooth(Car car)
	{
		if(car instanceof Swift)
		((Swift)car).bluetooth();
		
		if(car instanceof Audi)
		((Audi)car).bluetooth();
		
		if(car instanceof Bmw)
		((Bmw)car).bluetooth();
	}

//	
//  public void drive(Swift swift)
//	{
//		swift.Start();
//		swift.Accelarate();
//		swift.Stop();
//	}
//	public void drive(Audi audi)
//	{
//		audi.Start();
//		audi.Accelarate();
//		audi.Stop();
//	}
//	public void drive(Bmw bmw)
//	{
//		bmw.Start();
//		bmw.Accelarate();
//		bmw.Stop();
}