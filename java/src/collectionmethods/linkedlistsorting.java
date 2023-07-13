package collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlistsorting
{
  public static void main(String[] args) 
  {
	LinkedList a1=new LinkedList();
	a1.add(10);
	a1.add(60);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);
	Collections.sort(a1);
	
  }
}
