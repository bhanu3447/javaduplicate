package carDevelopment;

public class carDevelopmentModule 
{
	public static void main(String[] args) 
	{
		Driver d = new Driver();
		System.out.println("swift");
		d.drive(new Swift());
		d.accessBluetooth(new Swift());
		System.out.println("************");
		System.out.println("Bmw");
		d.drive(new Bmw());
		d.accessBluetooth(new Bmw());
		System.out.println("************");
		System.out.println("Audi");
		d.drive(new Audi());
	    d.accessBluetooth(new Audi());
		System.out.println("************");
		
	 
	  
	}

}
