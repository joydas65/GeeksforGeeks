class GfG
{
    int ans = Integer.MIN_VALUE;
    //int small = Integer.MAX_VALUE;
    int rightValue = 0,leftValue = 0;
    static int val = 0,x = Integer.MAX_VALUE;
    
    public static int findSmall(Node n){
        
        if(n == null)
        return Integer.MAX_VALUE;
        
        x = Math.min(x, findSmall(n.left));
        
        x = Math.min(x, n.data);
        
        x = Math.min(x, findSmall(n.right));
        
        //System.out.println(x);
        
        return x;
    }
    
    int maxDiff(Node root)
    {
        //your code here
        if(root == null)
        return ans;
    
        x = Integer.MAX_VALUE;
        leftValue = findSmall(root.left);
        x = Integer.MAX_VALUE;
        rightValue = findSmall(root.right);
        
        if(leftValue == root.data)
        leftValue = -1;
        if(rightValue == root.data)
        rightValue = -1;
        
        val = 0;
        
        if(rightValue == -1 && leftValue == -1)
        val = root.data;
        
        else if(rightValue == -1 && leftValue != -1)
        val = leftValue;
        
        else if(rightValue != -1 && leftValue == -1)
        val = rightValue;
        
        else
        val = Math.min(rightValue, leftValue);
        
        ans = Math.max(ans, root.data - val);
        
        return Math.max(ans, Math.max(maxDiff(root.left), maxDiff(root.right)));
    }
}
