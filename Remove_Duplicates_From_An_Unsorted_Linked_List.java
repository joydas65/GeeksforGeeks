class GfG
{
    // Function to remove duplicates from the given linked list
    Node removeDuplicates(Node head)
    {
         // Your code here
         
        HashSet<Integer> arr = new HashSet<Integer>();
        Node x = head;
        Node prev = null;
        while(x != null){
            if(arr.contains(x.data)){
                prev.next = prev.next.next;
            }else{
                prev = x;
            }
            arr.add(x.data);
            x = x.next;
        }
        return head;
    }
}
