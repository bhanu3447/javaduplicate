package stack;
import java.util.Stack;
public class stack 
{
  public static void main(String[]args)
  {
	  System.out.println(isBrackets("{()}"));
  }
  public static boolean isBrackets(String s)
  {
	  Stack <Character> stack=new Stack<Character>();
	  for(int i=0;i<=s.length();i++)
	  {
		  char ch1=s.charAt(i);
		  if(ch1=='{'||ch1=='('||ch1=='[')
		  {
			  stack.push(ch1);
		  }
		  else if(ch1=='}'||ch1==')'||ch1==']')
		  {
			if(stack.isEmpty())  return false;
			char ch2=stack.pop();
			if(!isPair(ch2,ch1)) return false;
		  }
	  }
	  if(stack.isEmpty()) return true;
	  return false;
  }
    public static boolean isPair(char ch2, char ch1)
  {
    	if(ch1=='{'&&ch2=='}') return true;
    	if(ch1=='('&&ch2==')') return true;
    	if(ch1=='['&&ch2==']') return true;    	
     	return false;
   } 
}
