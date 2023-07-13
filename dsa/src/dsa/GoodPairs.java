package dsa;

public class GoodPairs 
{
  public static void main(String[] args) {
	int []a= {1,2,3,1,1,3};
	int goodPairs = goodPairs(a);
	System.out.println(goodPairs);
  }
//  public static int goodPairs(int []a)
//  {
//	  int count=0;
//	  int l=a.length;
//	  for(int i=0;i<l;i++)
//	  {
//		  for(int j=i+1;j<l;j++)
//		  {
//			  if(a[i]==a[j])count++;
//		  }
//	  }
//	  return count;
//  }
  public static int goodPairs(int []a)
{
	  int freq[]=new int[101];
	 
	  for(int i=0;i<a.length;i++)
	  {
		  freq[a[i]]++;
	  }
	  int count=0;
	  
	  for(int i=0;i<freq.length;i++)
	  {
		count+=(freq[i])*(freq[i]-1)/2;
	  }
	return count;
	

}
}
