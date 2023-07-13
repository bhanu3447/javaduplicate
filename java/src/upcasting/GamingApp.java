package upcasting;

class Animal
{
	public void drink()   //general method
	{
		System.out.println("every animal requires water to drink");
	}
	public void sound() { }
	public void movement() { }
	
}
class Lion extends Animal
{
	@Override
	public void sound() 
	{
	   System.out.println("lion roars");	
	}
	@Override
	public void movement()
	{
		System.out.println("lionruns/walks");
	}
	public void preyStrategy()    //specific method
	{
		System.out.println("lion hunts for food");
	}
}
class Snake extends Animal
{
	@Override
	public void sound() 
	{
	   System.out.println("ssssssssshhhhhh");	
	}
	@Override
	public void movement()
	{
		System.out.println("nagin dance/cwarls");
	}
	public void venomUse()    //specific method
	{
		System.out.println("snake venom can be a medicines if used on quantity");
	}
	
}
public class GamingApp 
{
	public static void main(String[] args) 
	{
		Animal animal1=new Lion();    //upcasting
		animal1.drink();              //upcasting can access override methods and general methods
		animal1.sound();
		animal1.movement();
		((Snake) animal1).venomUse();
		
		Lion lion=(Lion)animal1;    //downcasting with reference
		lion.preyStrategy();        //downcasting can access the specifc methods of classes
		System.out.println("**************");
		
		Animal animal2=new Snake();    
		animal2.drink();
		animal2.sound();
		animal2.movement();
		
		((Snake)animal2).venomUse();   //downcasting without reference
	}
}
