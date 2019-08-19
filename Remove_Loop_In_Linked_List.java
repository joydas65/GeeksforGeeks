class Loop{
    
    // This function will remove the loop from the linked list
    public static void removeTheLoop(Node head)
    {
        //Your code here
        if(head == null)
        return;
        
        if(head.next == null)
        return;
        
        if(head.next == head){
            head.next = null;
            return;
        }
        
        Node n = head;
        
        HashSet<Node> arr = new HashSet<Node>();
        Node prev = null;
        
        while(true){
            if(arr.contains(n)){
                prev.next = null;
                break;
            }
            arr.add(n);
            prev = n;
            n = n.next;
            
            if(n == null)
            break;
        }
    }
}
