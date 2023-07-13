package dataencapsulation;

class A
{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
public class TestDataEncapsulation
{
	public static void main(String[] args)
	{
		A a1=new A();
		System.out.println(a1.getI());
		a1.setI(10);
		System.out.println(a1.getI());
	}

}
