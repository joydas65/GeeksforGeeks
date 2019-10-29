class GfG
{
    //Node node = null;
    int x = -999;
    int ans = 1;
    public int check(Node root){
        if(ans == 0)
        return ans;
        if(root.left != null){
            //x = root.data;
            if(check(root.left) == 0)
            return 0;
        }
        
        if(x > root.data){
            //System.out.println("Joy");
            ans = 0;
            return ans;
        }
        
        x = root.data;
        
        if(root.right != null){
            //x = root.data;
            if(check(root.right) == 0)
            return 0;
        }
        
        //x = root.data;
        
        return 1;
    }
    int isBST(Node root)  
    {
        if(root == null)
        return 1;
        GfG obj = new GfG();
        return obj.check(root);
        //return ans;
    }
}
