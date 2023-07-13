package tree_recurssion;

import java.util.LinkedList;
import java.util.Queue;

public class binarytree 
{
	private node root=null;
	private int count=0;
	private boolean flag=false;
	
	public boolean add(int k)
	{
		flag=false;
		root=addnode(k,root);
		return flag;
	}
	private node addnode(int k,node n)
	{
		if(n==null)
		{
			n=new node(k);
			count++;
			flag=true;
			return n;
		}
		if(k<n.key)  n.left=addnode(k,n.left);
		else if(k>n.key)  n.right=addnode(k,n.right);
		return n;
	}
	public int size()
	{
		return count;
	}
	public void levelorder()
	{
		Queue <node>q=new LinkedList<node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty())
		{
			node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
	    }
		System.out.println();
	}
	public void preordertraverse()
	{
		preorder(root);
		System.out.println();
	}
	private void preorder(node n)
	{
		if(n==null) return;
		System.out.print(n.key+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
	
	public void postordertraverse()
	{
		postorder(root);
		System.out.println();
	}
	private void postorder(node n)
	{
		if(n==null) return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.key+" ");
		
	}
	
	public void inordertraverse()
	{
		inorder(root);
		System.out.println();
	}
	private void inorder(node n)
	{
		if(n==null) return;
		inorder(n.left);
		System.out.print(n.key+" ");
		inorder(n.right);
	}
}
