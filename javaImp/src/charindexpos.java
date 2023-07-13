import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class charindexpos 
{ 
	public static void main(String[] args)
	  {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter string");
		String s=scn.nextLine();
		charIndexPos(s);
	  }
	public static void charIndexPos(String s)
	{
		Map<Character, String> m=new HashMap<Character, String>();
		

		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(!m.containsKey(c))
			{
				m.put(c,i+"");
			}
			else
			{
				String v = m.get(c);
				v=v+","+i;
				m.put(c, v);
			}
		}
		
		Set set = m.keySet();
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			Object key = i.next();
			 Object value= m.get(key);
			 
			 System.out.println(key+"="+value);
		}
		
	}
}
