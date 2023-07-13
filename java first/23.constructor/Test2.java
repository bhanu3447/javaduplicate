class B 
{

}
class C
{
	C(int i)
	{
     System.out.println("C constructor");
	}
}
class Test2
{
	public static void main(String[] args) 
	{
		new B();
		//new C();       because in classC there is no empty C constructor
		new C(10);
	}
}
