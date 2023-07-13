package singleton;


class A
{
	static int count;
	private static A t;
	private A()
	{
		count++;
	}	
    public static A getinstance()
    {
    	if(t==null) t=new A();
    	return t;
    }
}

public class singleton
{
	public static void main(String[] args) 
	{
	//	A a=new A();   //not accessible because private is not visible outside the class
		A a1=A.getinstance();
		A a2=A.getinstance();
		A a3=A.getinstance();
		
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1==a3);
		System.out.println(A.count);
	
	}

}
