class GfG
{
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum)
    {
        
        // Your code here
        boolean v1 = false, v2 = false;
        if(node != null && sum - node.data == 0 && node.left == null && node.right == null)
        return true;
        
        else if(node != null && sum - node.data > 0){
            v1 = hasPathSum(node.left, sum - node.data);
            v2 = hasPathSum(node.right, sum - node.data);
        }
        
        return v1 || v2;
    }
}
