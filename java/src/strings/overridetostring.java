package strings;

class employee
{
	String name;
	public employee(String name)
	{
		this.name=name;
	}

	public String toString()
	{
		return  "emp[name="+name+"]";
	}
}
public class overridetostring 
{
   public static void main(String[] args)
   {
	employee c= new employee("bhanu");
	System.out.println(c);
	System.out.println(c.toString());
   }
}
