class GfG
{
    static Node head = null;
    static Node prev = null;
    
    public static void compute(Node root){
        if(root == null)
	        return;
	        
	    compute(root.left);
	    
	    if(prev == null)
	        head = root;
	    else{
	        root.left = prev;
	        prev.right = root;
	    }
	    
	    prev = root;
	    
	    compute(root.right);
    }
    
    
    Node bToDLL(Node root)
    {
	//  Your code here
	    head = null;
	    prev = null;
	    compute(root);
	    return head;
    }
}
