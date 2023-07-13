package map;

import java.util.HashMap;
import java.util.Map;

public class map
{
	public static void main(String[] args)
   {
      Map m=new HashMap();
      System.out.println(m.put("a", 1));
      System.out.println(m.put("b", 2));
      System.out.println(m.put("a", 3));
      
      System.out.println("size="+m.size());
      System.out.println(m.get("a"));
      System.out.println(m.get("b"));
   }
}
