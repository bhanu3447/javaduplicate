package strings;

public class demo17 
{
  public static void main(String[] args)
  {
	String s1="java is an oop language";
	String s2="";
	char a[]=s1.toCharArray();
	int i=0,j=0;
	while(j<a.length)
	{
		while(j<a.length && a[j]!=' ') j++;
		String t=" ";
		int k=j-1;
		while(k>=i)
		{
			t+=a[k];
			k--;
		}
		s2+=t;
		if(j<a.length) s2+=" ";
		i++;
		i=j;
	} 
	System.out.println(s2);
	
  } 
}