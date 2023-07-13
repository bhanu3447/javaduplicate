class Red 
{
	public void Red()
	{
		System.out.println("Im Red");
	}
}
public class Example
{
	public static void main(String[] args) 
	{
		new Red().Red();
		Red r=new Red();
		r.Red();
	}
}
