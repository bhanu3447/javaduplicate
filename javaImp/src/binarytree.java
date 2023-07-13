public class binarytree
{
	public static void main(String[] args)
	{
		binarytreeimpl b = new binarytreeimpl();
		b.add(50);
		b.add(25);
		b.add(75);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(100);
		System.out.println(b.countLeafNodes(b.root));
	}
}

class node
{
	node left;
	node right;
	int key;
	
	public node(int key) {
		super();
		this.key = key;
	}

	public node(node left, node right, int key) {
		super();
		this.left = left;
		this.right = right;
		this.key = key;
	}
	
}
 class binarytreeimpl
{
  public node root=null;
  int count=0;
  
  public int countLeafNodes(node root)
  {
	  if(root==null) return 0;
	  if(root.left==null&&root.right==null) {
		  return 1;
	  }
	  int leftcount=countLeafNodes(root.left);
	  int rightcount=countLeafNodes(root.right);
	  return leftcount+rightcount;
	  
  }
  public  boolean add(int key)
  {
	  if(root==null)
	  {
		  root=new node(key);
		  count++;
		  return true;
	  }
	  node curr=root;
	  node prev=null;
	  while(curr!=null)
	  {
		  if(key<curr.key)
		  {
			  prev=curr;
			  curr=curr.left;
		  }
		  else if(key>curr.key)
		  {
			  prev=curr;
			  curr=curr.right;
		  }
		  else
		  {
			  return false;
		  }
	  }
	  if(key<prev.key)
	  {
		  prev.left=new node(key);
	  }
	  else if(key>prev.key)
	  {
		  prev.right=new node(key);
	  }
	  count++;
	  return true;
  }
  
}
