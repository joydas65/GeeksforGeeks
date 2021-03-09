class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    Node temp = head1;
	    
	    while(temp != null){
	        arr.add(temp.data);
	        temp = temp.next;
	    }
	    
	    temp = head2;
	    
	    while(temp != null){
	        arr.add(temp.data);
	        temp = temp.next;
	    }
	    
	    Collections.sort(arr);
	    
	    Node lastNode = null, head = null;
	    
	    for(int i = 0; i < arr.size(); i++){
	        if(i > 0 && arr.get(i-1) == arr.get(i))
	        continue;
	        Node node = new Node(arr.get(i));
	        if(lastNode != null)
	        lastNode.next = node;
	        else
	        head = node;
	        lastNode = node;
	    }
	    
	    return head;
	}
}
