class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node slow = head;
        Node fast = head;
        Node n = new Node(data);
        while(true){
            if(fast == null || fast.next == null || fast.next.next == null){
                Node x = slow.next;
                slow.next = n;
                n.next = x;
                break;
            }
            if(slow != null)
            slow = slow.next;
            if(fast != null && fast.next != null)
            fast = fast.next.next;
        }
        return head;
    }
}
