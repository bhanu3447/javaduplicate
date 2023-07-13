package strings;

import java.util.Stack;

public class balancedstring 
{
	public static void main(String[] args) 
	{
       System.out.println(isbalanced("[{}({})]"));
       System.out.println(isbalanced("{([])}"));
       System.out.println(isbalanced("{()[}]"));
       System.out.println(isbalanced("{)"));
	}
	
	static boolean isbalanced(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			if(c1=='['||c1=='{'||c1=='(')
			{
				stack.push(c1);
			}
			else if(c1==']'||c1=='}'||c1==')')
			{
				if(stack.isEmpty()||!pair(stack.pop(),c1)) return false;
			}
		}
		if(stack.isEmpty()) return true;
		else return false;
	}
	
	static boolean pair(char c1,char c2)
	{
		if(c1=='('||c2==')') return true;
		if(c1=='['||c2==']') return true;
		if(c1=='{'||c2=='}') return true;
		return false;
	}
}

