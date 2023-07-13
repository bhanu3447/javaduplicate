package JAVA8;

import java.util.Comparator;

public class helper  implements Comparator<car>
{


	@Override
	public int compare(car o1, car o2)
	{
		return o1.brand.compareToIgnoreCase(o2.brand);
	}

}