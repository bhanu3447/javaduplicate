
public class SplitInternalImplementation 
{
 public static void main(String[] args) 
 {
	 String s="i am in banglore";
	 String[] a = splitImplementation(s);
	 for(String c:a)
	 {
		 System.out.println(c);
	 }

 }
 public static String[] splitImplementation(String s)
 {
	 int spaces=0;
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)==' ') spaces++;
	 }
	 
	 String split[]=new String[spaces+1];
	 int index=0;
	 String s2="";
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i)!=' ') s2+=s.charAt(i);
		 else
			 {
			 split[index++]=s2;
			 s2="";
			 }
	 }
	 split[index]=s2;
//	 split[split.length-1]=s2;
	 return split;
	 
 }
//	 String s="i am in banglore";
//	 String[] x = splitImpl(s);
//	 for(String c:x)
//	 {
//		 System.out.println(c);
//	 }
// 
// }
// public static String[] splitImpl(String s)
// {
//
//	char[] c = s.toCharArray();
//	int count=1;
//	for(int i=0;i<s.length();i++)
//	{
//		if(c[i]==' ') count++;
//	}
//	String []a=new String[count];
//	
//	int i=0,j=0,index=0;
//	while(j<c.length)
//	{
//		while(j<c.length&&c[j]!=' ')j++;
//		String s2="";
//		 int k=i;
//		 while(k<j)
//		 {
//			 s2+=c[k];
//			 k++;
//		 }
//		 a[index++]=s2;
//		 s2="";
//		 j++;
//		 i=j;
//	}
//	return a;
// }
	
}
