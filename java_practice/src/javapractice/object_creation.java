package javapractice;

public class object_creation implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	String str="new object created";
	
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		object_creation obj = new object_creation();
		obj.clone();
	}
	
	
}



              /*using new keyword*/

//public class object_creation 
//{
//	public void show()
//	{
//		System.out.println("using new keyword");
//	}
//	
//   public static void main(String[] args)
//   {
//	object_creation obj = new object_creation();
//	obj.show();
//   }
//}
