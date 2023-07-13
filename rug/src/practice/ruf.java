package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ruf 
{
	
  public ruf(String string, int i) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) 
  {
	
//         Map<String, Integer> map = new HashMap<>();
//         map.put("A", 1);
//         map.put("B", 2);
//         map.put("C", 3);
//         map.put("D", 2);
//         map.put("E", 1);
//         map.put("F", 3);
//         map.put("G", 4);
//
//         Map<String, Integer> uniqueMap = new LinkedHashMap<>();
//        
//         for (String s:map.keySet())
//         {
//        	Integer v = map.get(s);
//        	if(!uniqueMap.containsValue(v))
//        	{
//        		uniqueMap.put(s, v);
//        	}
//         }
//         
//         
//         for (String key : uniqueMap.keySet()) {
//             Integer value = uniqueMap.get(key);
//             System.out.println(key + " - " + value);
//         }
//  }
//}
	  Map<String, Integer> map = new HashMap<>();
      map.put("D", 4);
      map.put("z", 2);
      map.put("C", 3);
      map.put("A", 1);

      Map<String, Integer> sortedMap = new TreeMap<>(map);

      // Print the sorted map by keys
      for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
          System.out.println(entry.getKey() + " - " + entry.getValue());
      }
  }
}
     
     
//		{
//			Object next = i.next();
//			Object value = m.get(next);
//			System.out.println(next+" "+value);
//		}
//	Collections.sort((List<T>) s);
//	
//	
//	System.out.println(m.get("a"));
//	Set s = m.keySet();
//	Iterator i = s.iterator();
//	
//	System.out.println(m.size());
//	while(i.hasNext())
//	{
//		Object next = i.next();
//		Object value = m.get(next);
//		System.out.println(next+" "+value);
//	}
	  
//	  Map m = new TreeMap();
//		System.out.println(m.put("a", 2));
//		
//		System.out.println(m.put("z", 3));
//		System.out.println(m.put("a", "ji"));
//		System.out.println(m.put("n", 31));
////		System.out.println(m.put("b", null));
//		
//		
//		System.out.println(m.get("a"));
//		Set s = m.keySet();
//		Iterator i = s.iterator();
//		
//		System.out.println(m.size());
//		
//		System.out.println("************");
//		while(i.hasNext())
//		{
//			Object next = i.next();
//			Object value = m.get(next);
//			System.out.println(next+" "+value);
//		}
	  
//	  ruf r=new ruf("s",2);
//	  ruf r2=new ruf("s",2);
//	  
//	  Map m=new IdentityHashMap<>();
//	  m.put(r, 12);
//	  Object object = m.get(r2);
//	  System.out.println(object);
	
