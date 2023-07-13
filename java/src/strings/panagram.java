package strings;

public class panagram 
{
  public static void main(String[] args) 
  {
	System.out.println(panagram("abcdefghijklmnopqrstuvwxyzzzzzzzzzzBHANA"));
  }
  
  static boolean panagram(String s)
  {
	  for(char c='a';c<='z';c++)
	  {
		  if(s.indexOf(c)==-1) return false;
	  }
	  return true;
  }
}
