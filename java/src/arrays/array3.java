package arrays;

public class array3 
{
  public static void main(String[] args) 
  {
	int[]a= {3,5,7,8};
	int sum=0;
	String s=" ";
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		s+=a[i];
		if(i<a.length-1) s+="+";
	}
	s+="="+sum;
	System.out.println(s);
  }
}
