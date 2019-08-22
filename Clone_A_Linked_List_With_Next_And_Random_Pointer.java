class Clone {
    Node copyList(Node head) {
        // your code here
        if(head == null)
        return head;
        
        if(head.next == null)
        return head;
        
        Node x = head;
        Node h = null;
        int c = 0;
        
        while(x != null){
            Node n = new Node(x.data);
            if(c == 0)
            h = n;
            x = x.next;
            n.next = x;
            c++;
        }
        
        x = head;
        
        Node temp = h;
        
        while(x != null){
            temp.arb = x.arb;
            x = x.next;
            temp = temp.next;
        }
        
        return h;
    }
}
