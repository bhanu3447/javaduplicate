 package JAVA8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test
{
	
 public static void main(String[] args)
   {
	List<car> cars=new ArrayList();
	
	cars.add(new car(1,"mustang","ford"));
	cars.add(new car(2,"maruthi","swift"));
	cars.add(new car(3,"duster","renault"));
	cars.add(new car(4,"seltos","kia"));
   
	
	
//	Collections.sort(cars,(e1,e2)->{
//		return e1.brand.compareToIgnoreCase(e2.brand);
//	});
//	
//	for(car c:cars)
//	{
//		System.out.println(c);
//	}
//   }
//}
	
	
	
	
	
	
	
	
/*anonymous class*/
	
//	Comparator<car> com=new Comparator<car>()
//			{
//
//
//				@Override
//				public int compare(car o1, car o2) 
//				{
//					return o1.brand.compareToIgnoreCase(o2.brand);
//				}
//		
//			};
//	
//	
//	Collections.sort(cars,com);
//	
//	
//	for(car c:cars)
//	{
//		System.out.println(c);
//	}
//   }
//}
 
	
	
 	
//	
	Collections.sort(cars,new helper());
	
	
	for(car c:cars)
	{
		System.out.println(c);
	}
   }
}



