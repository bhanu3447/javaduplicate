package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class banana 
{
  public static void main(String[] args) 
 {
	String s="banana";
	Map <Character,String>m=new LinkedHashMap<Character,String>();
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(!m.containsKey(ch))
		{
			m.put(ch,i+"");
		}
		else
		{
			String v=m.get(ch);
			v=v+","+i;
			m.put(ch, v);
		}
	}
//	Set v=m.keySet();
//	Iterator i=v.iterator();
	Iterator i=m.keySet().iterator();
	while(i.hasNext())
	{
		Object key=i.next();
		Object value=m.get(key);
		System.out.println(key+"="+value);
	}
 }
}
