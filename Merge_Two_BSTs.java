class GfG
{
    static ArrayList<Integer> arr;
    public void Inorder(Node n){
        if(n.left != null)
        Inorder(n.left);
        arr.add(n.data);
        if(n.right != null)
        Inorder(n.right);
    }
	public static void merge(Node root1 , Node root2)
    {
            //add code here.
        arr = new ArrayList<Integer>();
        new GfG().Inorder(root1);
        new GfG().Inorder(root2);
        Collections.sort(arr);
        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
