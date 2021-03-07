class GfG{
    void deleteNode(Node node) {
        //Add your code here
        Node prev = node;
        while(node.next != null){
            prev = node;
            node.data = node.next.data;
            node = node.next;
        }
        
        prev.next = null;
    }
}
