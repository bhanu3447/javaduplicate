package Final;

public class FinalConstructor
{
	final int i;
	
	 FinalConstructor()
	 {
		i = 20;
		 
	 }
	
	public static void main(String[] args) 
	{
         FinalConstructor f = new  FinalConstructor();
		System.out.println(f.i);
		
	}

}
