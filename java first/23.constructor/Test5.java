class Car
{
	String color;
	int num;
	private static int n=1000;

	Car(String C)
	{
		color=C;
		num=n++;
	}
}
class Test5
{
	public static void main(String[] args) 
	{
		Car c1=new Car("white");
		Car c2=new Car("black");
		System.out.println(c1.color);
		System.out.println(c1.num);
		System.out.println(c2.color);
		System.out.println(c2.num);

		
	}
}
