package interrfacce;

class washerman
{
	public void wash(Object obj)
	{
		if(obj instanceof washable)
			System.out.println("use water with pressure to wash");
		else System.out.println("this machine is not a washable type");
	}
}
class car implements washable
{
	
}
class truck implements washable
{
	
}
class bike implements washable
{
	
}
class cycle implements washable
{
	
}
class Tv
{
	
}
class washingmachine
{
	
}
interface washable
{
	
}
public class markerinterface
{
  public static void main(String[] args) 
  {
	washerman washer = new washerman();
	washer.wash(new car());
	washer.wash(new bike());
	washer.wash(new truck());
	washer.wash(new cycle());
	washer.wash(new Tv());
	washer.wash(new washingmachine());
  }
}
