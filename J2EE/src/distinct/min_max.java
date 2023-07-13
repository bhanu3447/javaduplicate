package distinct;

import java.util.ArrayList;
import java.util.List;

public class min_max 
{
   public static void main(String[] args) 
   {
	List <Integer> l=List.of(2,3,3,1,2,2,8,9);
	
	
//	Integer min=l.stream().min((e1,e2)->e1-e2).get();
//	System.out.println(min);
	
	Integer max=l.stream().max((e1,e2)->e1-e2).get();
	System.out.println(max);
			
	
   }
}
