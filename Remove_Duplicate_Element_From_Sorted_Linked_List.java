class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
	// Your code here	
	    Node x = root;
	    while(x != null){
	        if(x.next != null && x.data == x.next.data){
	            x.next = x.next.next;
	        }else{
	            x = x.next;
	        }
	    }
	    return root;
    }
}
