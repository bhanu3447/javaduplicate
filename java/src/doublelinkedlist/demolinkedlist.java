package doublelinkedlist;

public class demolinkedlist 
{
	public static void main(String[] args) 
	{
       linkedlist l=new linkedlist();
       l.add(10);
       l.add(60);
       l.add(30);
       l.add(50);
       
       System.out.println("size="+l.size());
       
       for(int i=0;i<l.size();i++)
       {
    	   System.out.println(l.get(i));
       }
     System.out.println(l.get(1));
       
	}

}
