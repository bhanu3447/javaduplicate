package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class hashtable
{
	public static void main(String[] args)
   {
      Map m=new Hashtable();
      m.put("maths",97);
      m.put("science",80);
      m.put("social",43);
      m.put("english",67);
      m.put("kannada",29);
//      m.put("kannada",null);

      
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
