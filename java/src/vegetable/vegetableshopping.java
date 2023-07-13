package vegetable;
import java.util.Scanner;
class Vegetable
{
	public void washingGuide()
	{
		System.out.println("use hot water");
		System.out.println("soak it for 15 min with salt");
	}
}
class Carrot extends Vegetable
{
	public void prepareCarrotHalwa()
	{
		System.out.println("Carrot Halwa is a Indian traditional sweet");
	}
}
class Potato extends Vegetable
{
	public void prepareFrenchFries()
	{
		System.out.println("French fries with more oil is not good for health");
	}
}
class Shopkeeper
{
	public Vegetable sell(String vegName)
	{
		if(vegName.equalsIgnoreCase("Carrot")) return new Carrot();
		if(vegName.equalsIgnoreCase("Potato")) return new Potato();
		System.out.println(vegName+"is not available");
		return null;	
	}
}
public class vegetableshopping 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("vegetable: ");
		String vegName=scn.nextLine();
		
		  Shopkeeper s = new Shopkeeper();
		  Vegetable veg=s.sell(vegName);
		  
		  if(veg instanceof Carrot)
		  ((Carrot)veg).prepareCarrotHalwa();
		  
		  if(veg instanceof Potato)
		  ((Potato)veg).prepareFrenchFries();	
	}

}