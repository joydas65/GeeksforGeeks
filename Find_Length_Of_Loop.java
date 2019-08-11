class Loop
{
    HashSet<Node> arr = new HashSet<Node>();
    int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    Node dummy = head, temp = head;
	    int c = 0;
	    while(dummy != null){
	        if(arr.contains(dummy)){
	            break;
	        }
	        c += 1;
	        arr.add(dummy);
	        dummy = dummy.next;
	    }
	    int d = 0;
	    if(dummy == null){
	        //System.out.println("hi");
	        return 0;
	    }
	    
	    
	    while(temp != dummy){
	        d++;
	        temp = temp.next;
	    }
	    //System.out.println(c);
	    return c-d;
    }
}
