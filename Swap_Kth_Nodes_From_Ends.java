class GFG
{
    // Should swap Kth node from beginning and 
    // Kth node from end in list and return new head.
    
    
    public int countNodes(Node head){
        Node n = head;
        int ans = 0;
        while(n != null){
            ans++;
            n = n.next;
        }
        return ans;
    }
    
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        
        Node x1 = null,x2 = null;
        Node n1 = head;
        Node temp1 = null,temp2 = null;
        for(int i = 1; i < K; i++){
            x1 = n1;
            n1 = n1.next;
            if(n1 == null)
            break;
        }
        
        if(n1 == null)
        return head;
        
        if(n1 != null)
        temp1 = n1.next;
        
        int c = countNodes(head);
        
        Node n2 = head;
        
        for(int i = 1; i <= (c - K); i++){
            x2 = n2;
            n2 = n2.next;
        }
        
        if(n2 != null)
        temp2 = n2.next;
        
        if(x1 != null)
        x1.next = n2;
        else{
            head = n2;
        }
        
        n2.next = temp1;
        
        if(x2 != null)
        x2.next = n1;
        else{
            head = n1;
        }
        
        n1.next = temp2;
        
        return head;
    }
}
