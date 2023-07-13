package map;

import java.util.IdentityHashMap;
import java.util.Map;

public class identityhashmap 
{
  public static void main(String[] args)
  {
	String s1=new String("java");
	String s2=new String("java");
	
	System.out.println(s1==s2);
	
	Map m=new IdentityHashMap();
	m.put(s1,1);
	System.out.println(m.get(s2));
  }
}
