class GfG
{
    public static void printLeaves(Node n){
        if(n == null)
        return;
        
        printLeaves(n.left);
        
        if(n.left == null && n.right == null)
        System.out.print(n.data+" ");
        
        printLeaves(n.right);
    }
    public static void printRightNodes(Node n){
        if(n == null)
        return;
        
        if(n.right != null){
            printRightNodes(n.right);
            System.out.print(n.data+" ");
        }
        else if(n.left != null){
            printRightNodes(n.left);
            System.out.print(n.data+" ");
        }
    }
    public static void printLeftNodes(Node n){
        if(n == null)
        return;
        
        if(n.left != null){
            System.out.print(n.data+" ");
            printLeftNodes(n.left);
        }
        else if(n.right != null){
            System.out.print(n.data+" ");
            printLeftNodes(n.right);
        }
    }
	void printBoundary(Node node)
	{
		// Your code here
		if(node == null)
		return;
		
		System.out.print(node.data+" ");
		printLeftNodes(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printRightNodes(node.right);
	}
}
