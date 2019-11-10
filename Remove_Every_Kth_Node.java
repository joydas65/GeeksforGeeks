class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(k == 1)
        return null;
        if(head == null || k == 0)
        return head;
        int c = 0;
        Node node = head, previous = null;
	// Your code here
	    while(node != null){
	        previous = node;
	        node = node.next;
	        c++;
	        if(c == k - 1){
	            c = 0;
	            if(previous.next != null)
	            previous.next = previous.next.next;
	            node = previous.next;
	        }
	    }
	    return head;
    }
}
