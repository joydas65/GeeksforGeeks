class Solution
{
    //Function to convert a binary tree into its mirror tree.
    void mirror(Node node)
    {
        if (node == null)
        return;
	// Your code here
	    mirror(node.left);
	    
	    mirror(node.right);
	    
	    Node temp = node.left;
	    
	    node.left = node.right;
	    
	    node.right = temp;
    }
}
