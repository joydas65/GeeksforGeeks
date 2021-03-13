class View
{
    static ArrayList<Integer> arr;
    
    public static void computeTopView(Node root){
        
        class queueObj{
            Node node;
            int hd;
            queueObj(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        
        Queue<queueObj> q = new LinkedList<queueObj>();
        
        arr = new ArrayList<Integer>();
        
        if(root == null){
            return;
        }else{
            q.add(new queueObj(root, 0));
        }
        
        HashMap<Integer, Node> tmap = new HashMap<Integer, Node>();
        
        while(!q.isEmpty()){
            
            queueObj nd = q.poll();
            if(!tmap.containsKey(nd.hd)){
                tmap.put(nd.hd, nd.node);
                mx = Math.max(mx, nd.hd);
                mn = Math.min(mn, nd.hd);
            }
            
            if(nd.node.left != null)
            q.add(new queueObj(nd.node.left, nd.hd - 1));
            
            if(nd.node.right != null)
            q.add(new queueObj(nd.node.right, nd.hd + 1));
        }
        
        for(int i = mn; i <= mx; i++){
            arr.add(tmap.get(i).data);
        }
    }
    
    // function should print the topView of the binary tree
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        computeTopView(root);
        return arr;
    }
}
