class BST
{
    /* This function should insert a new node with given data and
      return root of the modified tree  */
    HashSet<Integer> arr = new HashSet<Integer>();
    Node insert(Node root, int data)
    {
         // Your code here
         if(root == null){
             Node n = new Node(data);
             arr.add(data);
             return n;
         }
         
         if(arr.contains(data))
         return root;
         
         Node temp = root;
         
         while(true){
             if(temp.data < data){
                 if(temp.right == null){
                     Node n = new Node(data);
                     temp.right = n;
                     break;
                 }else{
                     temp = temp.right;
                 }
             }else{
                 if(temp.left == null){
                     Node n = new Node(data);
                     temp.left = n;
                     break;
                 }else{
                     temp = temp.left;
                 }
             }
         }
         arr.add(data);
         return root;
    }
}
