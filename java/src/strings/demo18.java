package strings;

public class demo18 
{
  public static void main(String[] args)
  {
	String s1="java is an oop language";
	String s2=" ";
	char arr[]=s1.toCharArray();
	int i=arr.length-1;
	int j=arr.length-1;
	while(j>0)
	{
		while(j>=0 && arr[j]!=' ') j--;
		
		String t=" ";
		int k=j+1;
		while(k<=i)
		{
			t+=arr[k];
			k++;
		}
		j--;
		i=j;
		s2+=t+"";
		s2=s2.trim();
	}
	System.out.println(s2);
	
  }
}