class A 
{
	public static void print(int num)
	{
		if(--num<0) return;
		System.out.println("java is very easy");
		print(num);
      
	}
	public static void main(String[] args) 
	{
		print(1000);
	}
}
