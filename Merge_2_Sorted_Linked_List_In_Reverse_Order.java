class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
        Node x = null, temp = null;
	    while(node1 != null && node2 != null){
	        if(node1.data < node2.data){
	            temp = node1;
	            node1 = node1.next;
	            temp.next = x;
	            x = temp;
	        }else if(node1.data > node2.data){
	            temp = node2;
	            node2 = node2.next;
	            temp.next = x;
	            x = temp;
	        }else{
	            temp = node1;
	            node1 = node1.next;
	            temp.next = x;
	            x = temp;
	            temp = node2;
	            node2 = node2.next;
	            temp.next = x;
	            x = temp;
	        }
	    }
	    if(node1 == null && node2 != null){
	        while(node2 != null){
	            temp = node2;
	            node2 = node2.next;
	            temp.next = x;
	            x = temp;
	        }
	    }else if(node2 == null && node1 != null){
	        while(node1 != null){
	            temp = node1;
	            node1 = node1.next;
	            temp.next = x;
	            x = temp;
	        }
	    }
	    
	    return temp;
    }
}
