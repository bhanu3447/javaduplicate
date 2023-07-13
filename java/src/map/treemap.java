package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap
{
	public static void main(String[] args)
   {
      Map m=new TreeMap();
      m.put("maths",97);
      m.put("science",80);
      m.put("social",43);
      m.put("english",67);
      m.put("kannada",29);
      
      Set s=m.keySet();
      Iterator i= s.iterator();
      while(i.hasNext())
      {
    	  Object key=i.next();
    	  Object value=m.get(key);
    	  System.out.println(key+"="+value);
      }
   }
}
