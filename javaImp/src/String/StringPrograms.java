package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringPrograms 
{
  public static void main(String[] args) 
  {
	 
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter a string");
//	  String s=scn.nextLine();
//	  String s="MalaYaLaM";
      
//	  if(PalindromeCharArray(s))
//	  {
//		  System.out.println(s+" is a palindrome");
//	  }
//	  else
//	  {
//		  System.out.println(s+" is not a palindrome");
//	  }
	  
	  
//	  if(PalindromeCharAt(s))
//	  {
//		  System.out.println(s+" is a palindrome");
//	  }
//	  else
//	  {
//		  System.out.println(s+" is not a palindrome");
//	  }
//	  System.out.println();
	  
	  
//	  if(PalindromeStringBuilder(s))
//	  {
//		  System.out.println(s+" is a palindrome");
//	  }
//	  else
//	  {
//		  System.out.println(s+" is not a palindrome");
//	  }
	  
	  
//	  String s="madam";
//	  s=s.toUpperCase();
//	  if(PalindromeRecurrsion(s))
//	  {
//		  System.out.println(s+" is a palindrome");
//	  }
//	  else 
//	  {
//		  System.out.println(s+" is not a palindrome");
//	  }
	  
//	  if(PalindromeRecurrsion2(s,0,s.length()-1))
//	  {
//		  System.out.println(s+" is a palindrome");
//	  }
//	  else 
//	  {
//		  System.out.println(s+" is not a palindrome");
//	  }
	  
	  
//	  palindromes(s);
	  
	  
//	  String s="The quick brown fox jumps over the lazy dog";
//	  if(panagram(s))
//	  {
//		  System.out.println(s+" is a panagram");
//	  }
//	  else
//	  {
//	    System.out.println(s+" is not a panagram");
//	  }
	  
//	     if(panagramset(s))
//		  {
//			  System.out.println(s+" is a panagram");
//		  }
//		  else
//		  {
//		    System.out.println(s+" is not a panagram");
//		  }
	  
//	  if(panagramboolean(s))
//		  {
//			  System.out.println(s+" is a panagram");
//		  }
//		  else
//		  {
//		    System.out.println(s+" is not a panagram");
//		  }
	  
	  
//	  String s1="ra             ce";
//	  String s2="care";
//	 if( anagram(s1, s2))
//	 {
//		  System.out.println(s1+" and "+s2+" are anagrams");
//	  }
//	  else
//	  {
//		  System.out.println(s1+" and "+s2+" are anagrams");
//	  }
//	  if( anagramUsingSort(s1, s2))
//		 {
//			  System.out.println(s1+" and "+s2+" are anagrams");
//		  }
//		  else
//		  {
//			  System.out.println(s1+" and "+s2+" are anagrams");
//		  }
		 
	  
//	  String s="i am going outside";
//	  countvowels(s);
	  
//	  String s="My Name IS Bhanu PrakaSh";
//	  changecase(s);
	  
	  
//	  String s="My Name IS Bhan888u Pra69kaSh";
//	  sumOfDigitsInAString(s);
	  
	  
//	  noOfCharsPresentInString();
	  
	  
//	  countCharacters();
	  
	  
//	  swappingStringWithTempVariable();
	  
//	  swappingStringwithSubString();
	  
//	  swappingStringWithIndexOF();
	  
//	  reversingAWholeString();
	  
//	  reversingEachWordInAString();
	  
//	  permutation("abc", 0, 2);
	  
//	  removeDuplicates();
	  
//	  if(rotationOfString())
//	  {
//		  System.out.println("they are rotation of each other");
//	  }
//	  else
//	  {
//		  System.out.println("they are not rotation of each other");
//	  }
	  
	  
	  
//	  Scanner scn=new Scanner(System.in);
//	  System.out.println("enter string");
//	  String s=scn.nextLine();
//	  System.out.println("before"+" "+s);
//	  s= sort(s);
//	  System.out.println("after"+" "+s);
	  
//	  System.out.println("unSorted string: " + s);
//	  s = sortInbuilt(s);
//	  System.out.println("Sorted string: " + s);
	  
//	  StringArrangementSort();
	  
//	  StartLastIndexArray();
	  
//	  StartLastIndexArraySecondMethod();
	  
//	  reverseStringWithSpacesIntact();
	  
	  reverseStringWithSpacesIntact2();
	  
	  
  }
  
  public static boolean PalindromeCharArray(String s)
  {
	char[] c = s.toUpperCase().toCharArray();
	int i=0;
	int j=c.length-1;
	while(i<j)
	{
	   if(c[i]!=c[j]) return false;
	   i++;
	   j--;
	}
	return true;
  }
  public static boolean PalindromeCharAt(String s)
  {
	   s.toUpperCase();
	int i=0;
	int j=s.length()-1;
	
	while(i<j)
	{
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;
		j--;
	}
	return true;
  }
  public static boolean PalindromeStringBuilder(String s)
  {
	  s=s.toUpperCase();
	  StringBuilder sb = new StringBuilder(s);
	  return s.equals(sb.reverse().toString());

  }
  public static boolean PalindromeRecurrsion(String s)
  {
	  if(s.length()<=1) return true;
	  else if(s.charAt(0)==s.charAt(s.length()-1))
	  {
		  return PalindromeRecurrsion(s.substring(1, s.length()-1));
	  }
	  else
	  {
		  return false;
	  }
		  
  }
  public static boolean PalindromeRecurrsion2(String s,int start,int end)
  {
	  if(start>=end)
	  {
		  return true;
	  }
	  if(s.charAt(start)!=s.charAt(end)) return false;
	  return PalindromeRecurrsion2(s, start+1, end-1);
	  
		  
  }
  public static void palindromes(String s)
  {
	  s=s.toUpperCase();
	  int count=0;
	  for(int i=0;i<s.length()-1;i++)
	  {
		  for(int j=i+2;j<=s.length();j++)
		  {
			  String s1 = s.substring(i, j);
			  if(PalindromeCharAt(s1)) 
				  {
				    count++;
				    System.out.println(s1);
				  }
		  }
	  }
	  System.out.println(" no of palindromes in "+s+" are "+count);
  }
  public static boolean panagram(String s)
  {
	  s=s.toUpperCase();
	  for(char c='A';c <='Z';c++)
	  {
		  if(s.indexOf(c)==-1)
			  {
			    return false;
			  }
	  }
	  return true;
  }
  public static boolean panagramset(String s)
  {
	  s=s.toUpperCase();
	  
	  Set<Character> c= new HashSet<>();
	 
	  for(char a:s.toCharArray())
	  {
		  if(Character.isLetter(a))
		  {
			  c.add(a);
		  }
	  }
	  return c.size()==26;
  }
  public static boolean panagramboolean(String s)
  {
	  s=s.toLowerCase();
	  
	  boolean []b=new boolean[26];
	  
	  for(int i=0;i<s.length();i++)
	  {
		  char c=s.charAt(i);
		  if(Character.isLetter(c))
		  {
			  int index=c-'a';
			  b[index]=true;
		  }
	  }
	  for(boolean letter:b)
	  {
		  if(!letter)
		  {
			  return false;
		  }
	  }
	  return true;
  }
  public static boolean anagram(String s1,String s2)
  {
	  s1=s1.toLowerCase();
	  s2=s2.toLowerCase();
	while(true)
	{
	   if(s1.length()==0&&s2.length()==0) return true;
	    if(s1.length()!=s2.length()) return false;
	    char c = s1.charAt(0);
	    s1=s1.replace(c+"", "");
	    s2=s2.replace(c+"", "");
	}
  }
  public static boolean anagramUsingSort(String s1,String s2)
  {
	  s1=s1.toLowerCase().replaceAll(" ", "");
	  s2=s2.toLowerCase().replaceAll(" ", "");
	  
	  char[]  c1 = s1.toCharArray();
	  char[]  c2= s2.toCharArray();
	  
	  Arrays.sort(c1);
	  Arrays.sort(c2);
	  
	  return Arrays.equals(c1, c2);
  }
  public static void countvowels(String s)
  {
	  char[] c = s.toUpperCase().toCharArray();
	  
	  int count=0;
//	  for(char a:c)
//	  {
//		  if(a=='A'||a=='E'||a=='I'||a=='O'||a=='a')
//		  {
//			  count++;
//			  System.out.println(a);
//		  }
//	  }
//  }
	 for(char a:c)
	 {
	  switch (a) 
	  {
	    case 'A':
	    case 'E':
	    case 'I':
	    case 'O':
	    case 'U':count++;
	    System.out.println(c); 
	   }
	  System.out.println("no of vowels "+count);
	 }
  }
	 public static void changecase(String s)
	 {
		 char[] c = s.toCharArray();
		 String s2="";
		 for(char a:c)
		 {
			 if(a>='A'&&a<='Z')s2+=Character.toLowerCase(a);
			 else if(a>='a'&&a<='z')s2+=Character.toUpperCase(a);
			 else s2+=Character.toString(a);
		 }
		 System.out.println(s);
		 System.out.println(s2);
			 
	 }
	 
	 
	 public static void sumOfDigitsInAString(String s)
	 {
		 char[] c = s.toCharArray();
		 int count=0;
		 int sum=0;
		 
//		 for(char a:c)
//		 {
//			 if(a>='0'&&a<='9') 
//			 {
//				count++;
//				sum+=(a-'0');   //0 ascii value will be 48
//			 }
//		 }
		 
		 for(int i=0;i<s.length();i++)
		 {
			 if(c[i]>=48&&c[i]<=57)
			 {
				 sum+=c[i]-48;  //0 ascii value will be 48
				 count++;
			 }
		 }
		 System.out.println(count);
		 System.out.println("sum ="+sum);
	 }
	 
	 public static void noOfCharsPresentInString()
	 {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter a string");
		 String s1=scn.nextLine();
		 System.out.println("enter a string to be continued");
		 String s2=scn.nextLine();
		 
		 String s3=s1.replace(s2, "");
		 int count=s1.length()-s3.length();
		 count=count/s2.length();
		 System.out.println(s2+" exist "+count+" times ");
	 }
	 
	 public static void countCharacters()
	 {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter a string");
		 String s1=scn.nextLine();
		 String s2="";
		 char c;
		 while(s1.length()>0)
		 {
			 
			 c = s1.charAt(0);
			 s2=s1.replace(c+"", "");
			 int count=s1.length()-s2.length();
			 System.out.println(c+"="+count);
			 s1=s2;
			 
		 }
	 }
		 
	 
	 public static void swappingStringWithTempVariable()
	 {
		    Scanner scn = new Scanner(System.in);
		    System.out.println("Enter a string s1");
		    String s1 = scn.nextLine();
		    System.out.println("Enter a string s2");
		    String s2 = scn.nextLine();

		    String temp = s1;
		    s1 = s2;
		    s2 = temp;

		    System.out.println(s1);
		    System.out.println(s2);
		}

		 public static void swappingStringwithSubString()
		 {
			 Scanner scn=new Scanner(System.in);
			 System.out.println("enter a string s1");
			 String s1=scn.nextLine();
			 System.out.println("enter a string s2");
			 String s2=scn.nextLine();
			 
			 s1=s1+s2;
			 
			 s2=s1.substring(0,s1.length()-s2.length());
			 s1=s1.substring(s2.length());
			 
			 System.out.println(s1);
			 System.out.println(s2);
		 }
		 public static void swappingStringWithIndexOF()
		 {
			 Scanner scn=new Scanner(System.in);
			 System.out.println("enter a string");
			 String s1=scn.nextLine();
			 System.out.println("enter a string");
			 String s2=scn.nextLine();
			 
			 s1=s1+s2;
			 s2=s1.substring(0,s1.indexOf(s2));
			 s1=s1.substring(s2.length());
			 System.out.println(s1);
			 System.out.println(s2);
		 }
		 
		 public static void swappingStringWithCollections() 
		 {
			    Scanner scn = new Scanner(System.in);
			    System.out.println("Enter a string s1");
			    String s1 = scn.nextLine();
			    System.out.println("Enter a string s2");
			    String s2 = scn.nextLine();

			    List<String> list = new ArrayList<>();
			    list.add(s1);
			    list.add(s2);
			    Collections.reverse(list);

			    s1 = list.get(0);
			    s2 = list.get(1);
			    
			    System.out.println(s1);
			    System.out.println(s2);
			}
		 
		 public static void reversingAWholeString() 
		 {
			    Scanner scn = new Scanner(System.in);
			    System.out.println("Enter a string ");
			    String s1 = scn.nextLine();
			    
			    String s2="";
			    for(int i=s1.length()-1;i>=0;i--)
			    {
			    	s2+=s1.charAt(i);
			    }
			    
			    System.out.println(s2);
			    
		 }
		 
		 public static void reversingEachWordInAString() 
		 {
			    Scanner scn = new Scanner(System.in);
			    System.out.println("Enter a string ");
			    String s1 = scn.nextLine();
			    String[] arr= s1.split(" ");
			    String s2="";
			    for(int i=arr.length-1;i>=0;i--)
			    {
			    	s2+=arr[i];
			    	if(i!=0)s2+=" ";
			    }
			    
			    System.out.println(s2);
			    
		 }
		 
		 public static void permutation(String s,int start,int end)
		 {
			 if(start==end)
			 {
				 System.out.println(s);
				 return;
			 }
				 
		     for(int i=start;i<=end;i++)
		     {
		    	 String s1 = swapPermutation(s, start, i);
		    	 permutation(s1, start+1, end);
		     }
			 
	    
		 }
		 private static String swapPermutation(String s,int i,int j)
		 {
			 char[] c = s.toCharArray();
			 char temp=c[i];
			 c[i]=c[j];
			 c[j]=temp;
			 return new String(c);
		 }
		 
		 public static void removeDuplicates() 
		 {
			 Scanner scn = new Scanner(System.in);
			    System.out.println("Enter a string ");
			    String s1 = scn.nextLine();
			    
			   String s2="";
			   for(int i=0;i<s1.length();i++)
			   {
				   char c = s1.charAt(i);
				   if(s2.indexOf(c)==-1)s2+=c;
			   }
			   System.out.println(s2);
		 }
		 public static boolean rotationOfString()
		 {
			    Scanner scn = new Scanner(System.in);
			    System.out.println("Enter a string ");
			    String s1 = scn.nextLine();
			    System.out.println("Enter a string ");
			    String s2 = scn.nextLine();
			    
			    if(s1.length()!=s2.length()) return false;
			     
			    for(int i=0;i<s2.length();i++)
			    {
			    	s2=s2.substring(1)+s2.charAt(0);
			    	if(s2.equals(s1)) return true;
			    }
			    return false;
			    
			    
			    
//			    char[] c = s2.toCharArray();
//			    for(int i=0;i<c.length-1;i++)
//			    {
//			    	int j=c.length-1;
//			    	char temp=c[i];
//			    	c[i]=c[j];
//			    	c[j]=temp;
//			    	j--;
//			    	
//			    	String rotated = new String(c);
//			    	if(s1.equals(rotated)) return true;
//			    }
//			    return false;
		 }
		 
		 public static String sort(String s)
		  {
			  char[] c = s.toLowerCase().toCharArray();
			  for(int i=0;i<s.length();i++)
			  {
				  boolean flag=false;
				  for(int j=0;j<s.length()-1-i;j++)
				  {
					  if(c[j]>c[j+1])
					  {
						  char temp=c[j];
						  c[j]=c[j+1];
						  c[j+1]=temp;
						  flag=true;
					  }
				  }
				  if(flag==false) break;
			  }
			  return new String(c);
		  }
		  
		  
		  public static String sortInbuilt(String s)
		  {
			  char[] c = s.toUpperCase().toCharArray();
			  Arrays.sort(c);
			  return new String(c);
		  }
		  
		  
		  public static void StringArrangementSort()
		  {
		    Scanner scn = new Scanner(System.in);
		    System.out.println("Enter a string:");
//		    String s = "mmmmmmmmmmmm iii ii aa hhhhhh ii i mmmm";
		    String s=scn.nextLine();
		    
		    String[] a = s.split(" ");
		    Arrays.sort(a);
		    
		    for(String c:a)
		    {
		    	System.out.println(c);
		    }
		    System.out.println("*****************************");
		    for (int i = 0; i <a.length - 1; i++) {
		        for (int j = 0; j < a.length-1 - i; j++) {
		        	
		            if (a[j].length() > a[j + 1].length()) {
		                String temp = a[j];
		                a[j] = a[j + 1];
		                a[j + 1] = temp;
		            }
		        }
		    }
		    for(String c:a)
		    {
		    	System.out.println(c);
		    }
	    }
		  
		  public static void StartLastIndexArray()
		  {
		    Scanner scn=new Scanner(System.in);
			 System.out.println("enter a number");
			 int n=scn.nextInt();
			int a[]= {1,2,4,4,4,3,3,7,7};
			Arrays.sort(a);
			
			int startIndex=-1;
		    for(int i=0;i<a.length;i++)
		    {
		    	if(a[i]==n) 
		    		{
		    		startIndex=i ;
		    		break;
		    		}
		    	
		    }
		    int lastIndex=-1;
		    for(int i=a.length-1;i>=0;i--)
		    {
		    	if(a[i]==n) 
		    	{
		    		lastIndex=i;
		    		break;
		    	}
		    }
		    if (startIndex != -1 && lastIndex != -1) {
	            System.out.println("Start Index: " + startIndex);
	            System.out.println("Last Index: " + lastIndex);
	        } else {
	            System.out.println("Number not found in the array.");
	        }
		 }
		  
		  public static void StartLastIndexArraySecondMethod()
		  {
			  Scanner scn=new Scanner(System.in);
				 System.out.println("enter a number");
				 int n=scn.nextInt();
				int a[]= {1,2,4,4,4,3,3,7,7};
				Arrays.sort(a);
				int startindex=-1;
				int lastindex=-1;
				
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==n)
					{
						if(startindex==-1)
						{
							startindex=i;
						}
						lastindex=i;
					}
				}
				 if (startindex!= -1 && lastindex!= -1) {
			            System.out.println("Start Index: " + startindex);
			            System.out.println("Last Index: " + lastindex);
			        } else {
			            System.out.println("Number not found in the array.");
			        }
		  }
		  public static void reverseStringWithSpacesIntact()
		  {
			  Scanner scn=new Scanner(System.in);
			  System.out.println("enter a string");
			  String s=scn.nextLine();
			  char[] c = s.toCharArray();
			  int i=0;
			  int j=c.length-1;
			  while(i<j)
			  {
				  if(c[i]!=' ' && c[j]!=' ')
				  {
					  char temp=c[i];
					  c[i]=c[j];
					  c[j]=temp;  
					  i++;
					  j--;
				  }
				  if(c[i]==' ')i++;
				  if(c[j]==' ')j--;
			  }
			  
			  String output = new String(c);
			  System.out.println(output);
		  }
		  public static void reverseStringWithSpacesIntact2()
		  {
			  Scanner scn=new Scanner(System.in);
			  System.out.println("enter a string");
			  String s=scn.nextLine();
			  String s2="";
			  for(int i=s.length()-1;i>=0;i--)
			  {
				  if(s.charAt(i)!=' ')
				  {
					  s2+=s.charAt(i);
				  }
			  }
			  String s3="";
			  int index=0;
			  for(int i=0;i<s.length();i++)
			  {
				 if(s.charAt(i)!=' ')
				 {
					 s3+=s2.charAt(index);
					 index++;
				 }
				 else
				 {
					 s3+=s.charAt(i);
				 }
			  }
			  System.out.println(s3);
		  }
		  public static void 
}
