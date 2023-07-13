class Jio 
{
	String simName;
	public Jio(String simName)
	{
		this.simName=simName;
	}
	public void callImplementationOfJio()
	{
		System.out.println(simName+"is used for calling");
		System.out.println("you can use internet over call");
	}
}
class Idea
{
	String simName;
	public Idea(String simName)
	{
		this.simName=simName;
	}
	public void callImplementationOfIdea()
	{
		System.out.println(simName+"is used for calling");
		System.out.println("you cannot use internet over call");
	}
}
class Airtel
{
	String simName;
	public Airtel(String simName)
	{
		this.simName=simName;
	}
	public void callImplementationOfAirtel()
	{
		System.out.println(simName+" is used for calling");
		System.out.println("you can use internet over call");
		System.out.println("Airtel has free internet");
	}
}
class Battery
{
	String batteryName;
	public Battery(String batteryName)
	{
		this.batteryName=batteryName;
	}
}
class Phone
{
	String phoneName;
	Battery battery;
	public Phone(String phoneName,Battery battery)
	{
        this.phoneName=phoneName;
		this.battery=battery;
	}
    public void call(Jio sim)
	{
		sim.callImplementationOfJio();
	}
	public void call(Idea sim)
	{
		sim.callImplementationOfIdea();
	}
	public void call(Airtel sim)
	{
		sim.callImplementationOfAirtel();
	}
}
class PhoneDevelopment
{
	public static void main(String [] args)
	{
		/*Battery b=new Battery("lithium-ion");
		Phone phone=new Phone("iphone", b);

		Phone phone=new Phone("iphone",new Battery("lithium-ion"));
		phone.call(new Airtel("Airtel"));
		phone.call(new Idea("Idea"));
		phone.call(new Jio("Jio"));*/

		Jio jio=new Jio("jio");
		Idea idea=new Idea("idea");
		Airtel airtel=new Airtel("airtel");
        Phone phone=new Phone("iphone",new Battery("lithium-ion"));
		phone.call(airtel);
		phone.call(jio);
		phone.call(idea);



	}
}