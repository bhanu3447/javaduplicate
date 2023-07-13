package carDevelopment;

public class Swift extends Car
{
		@Override
		public void Start() 
		{
			System.out.println("key start");
		}
		@Override
		public void Accelarate() 
		{
			System.out.println("half clutch drive");
		}
		@Override
		public void Stop() 
		{
			System.out.println("key stop");
		}
		public void bluetooth() //Specific method
		{
			System.out.println("Boat bluetooth for Swift Car");
		}
}
