package strings;

public class demo16 
{
	public static void main(String[] args)
	{
			String s1="               java is an oop language   ";
			String []arr=s1.split(" ");
			String s2="";
			for(String str:arr)
			{
				s2+=rev(str);
				s2+=" ";
			}
			s2=s2.trim();
			System.out.println(s2);
	}
	static String rev(String s)
	{
	  char a[]=s.toCharArray();
	  String s1=" ";
	  for(int i=a.length-1;i>=0;i--)
	  {
		s1+=a[i]  ;
	  }
	  return s1;
	}
//      static String rev(String s)
//      {
//		char a[]=s.toCharArray();
//		int i=0, j=a.length-1;
//		while(i<j)
//		{
//			char temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			i++;
//			j--;
//		}
//		return new String(a);
//	}

}
