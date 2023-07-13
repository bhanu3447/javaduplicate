package treewhileloop;

public class binarytree 
{
	private node root=null;
	private int count=0;
	
	public boolean add(int k)
	{
		if(root==null) 
		{
			root=new node(k);
			count++;
			return true;
		}
		node curr=root;
		node prev=null;
		
		while(curr!=null)
		{
			if(k<curr.key) 
			{
				prev=curr;
				curr=curr.left;
			}
			else if(k>curr.key)
			{
				prev=curr;
				curr=curr.right;
			}
			else
			{
				return false;
			}
			
		}
		if(k<prev.key)
		{
			prev.left=new node(k);
		}
		else
		{
			prev.right=new node(k);
		}
		count++;
		return true;
	}
	public int size()
	{
		return count;
	}
}
