class Loop{
    int detectLoop(Node head) {
        
        if(head.next == null)
        return 0;
        
        if(head.next == head)
        return 1;
        // Add code here
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while(true){
            if(fast == null || fast.next == null){
                flag = 0;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        return 1;
        return 0;
    }
}
