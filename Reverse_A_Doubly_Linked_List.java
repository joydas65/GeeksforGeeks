class GfG
{
    Node reverse(Node head)
    {
        // Your code here 
        Node temp = null;
        Node nd = head;
        Node n = null;
        while(nd != null){
            n = nd.next;
            nd.next = temp;
            nd.prev = n;
            temp = nd;
            nd = n;
        }
        return temp;
    }
}
