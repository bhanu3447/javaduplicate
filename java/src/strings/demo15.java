package strings;

public class demo15 
{
	public static void main(String[] args)
	{
			String s1="java is an oop language";
			String []arr=s1.split("");
			String s2="";
			for(int i=arr.length-1;i>=0;i--)
			{
				s2+=arr[i];
//				if(i!=0) s2+="";
				s2=s2+"";
			}
			s2=s2.trim();
			System.out.println(s2);
	}

}
