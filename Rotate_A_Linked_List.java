class Rotate{
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k){
        // add code here.
        //Queue<Node> arr = new LinkedList<Node>();
        Node n = head;
        Node prev = null, x = null;
        for(int i = 1; i <= k; i++){
            //arr.add(n);
            prev = n;
            n = n.next;
            if(n == null)
            break;
        }
        if(n == null)
        return head;
        x = n;
        prev.next = null;
        while(n.next != null){
            n = n.next;
        }
        n.next = head;
        head = x;
        return head;
    }
}
