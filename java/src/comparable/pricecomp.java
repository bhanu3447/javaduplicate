package comparable;

import java.util.Comparator;

public class pricecomp  implements Comparator
{

	public int compare(Object arg1, Object arg2) 
	{
		book b1=(book)arg1;
		book b2=(book)arg2;
		if(b1.price>b2.price) return 1;
		if(b1.price<b2.price) return -1;
		return 0;
	}
 
}
