package comparable;

import java.util.Arrays;

class democircle
{
	public void main(String[] args)
	{
		circle []a=new circle[6];
		a[0]=new circle(40);
		a[1]=new circle(30);
		a[2]=new circle(20);
		a[3]=new circle(10);
		Arrays.sort(a);
		for(circle c:a)
		{
			System.out.println(c);
		}
	}
}