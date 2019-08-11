class Add {
    
    // This function will add the numbers represented by two linked lists
    public static Node findSum(Node first, Node second, int d){
        int f = 0;
        Node a = first, b = second, prev = first;
        while(a != null && b != null){
            prev = a;
            int t = a.data + b.data + f;
            a.data = (a.data + b.data + f)%10;
            if(t >= 10)
            f = 1;
            else
            f = 0;
            a = a.next;
            b = b.next;
        }
        if(d == 0 && f == 0)
        return first;
        
        if(d == 0 && f == 1){
            Node n = new Node(f);
            prev.next = n;
            n.next = null;
            return first;
        }
        
        while(a != null){
            prev = a;
            int t = a.data + f;
            a.data = (a.data + f)%10;
            if(t >= 10)
            f = 1;
            else
            f = 0;
            a = a.next;
        }
        
        if(f == 1){
            Node n = new Node(f);
            prev.next = n;
            n.next = null;
        }
        
        return first;
    }
    Node addTwoLists(Node first, Node second) {
        // Your code here
        Node a = first;
        int c1=0;
        while(a != null){
            c1++;
            a = a.next;
        }
        int c2=0;
        Node b = second;
        while(b != null){
            c2++;
            b = b.next;
        }
        if(c1 > c2)
        return findSum(first,second,c1-c2);
        return findSum(second, first,c2-c1);
    }
}
