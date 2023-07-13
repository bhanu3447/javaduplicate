package strings;

class emp
{
	String name;
	public emp(String name)
	{
		this.name=name;
	}
	
}
public class tostring 
{
   public static void main(String[] args)
   {
	emp s = new emp("bhanu");
	System.out.println(s);
	System.out.println(s.toString());
   }
}
