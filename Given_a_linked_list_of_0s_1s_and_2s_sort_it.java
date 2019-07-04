class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        
        int zero=0,one=0,two=0;
        
        Node x = head;
        while(x != null){
            if(x.data == 0)
            zero++;
            else if(x.data == 1)
            one++;
            else if(x.data == 2)
            two++;
            x = x.next;
        }
        
        Node n = head;
        for(int i = 1; i <= zero; i++){
            n.data = 0;
            n = n.next;
        }
        for(int i = 1; i <= one; i++){
            n.data = 1;
            n = n.next;
        }
        for(int i = 1; i <= two; i++){
            n.data = 2;
            n = n.next;
        }
        return head;
    }
}
