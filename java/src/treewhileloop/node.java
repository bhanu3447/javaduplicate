package treewhileloop;

public class node
{
 int key;
 node left;
 node right;
 public node(int k)
 {
	 key=k;
 }
 public node(int k,node l,node r)
 {
	 key=k;
	 left=l;
	 right=r;
 }
}
