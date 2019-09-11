class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node ans = null;
        Node Top = node, top = null, temp = node, x = null, v = null;
        for(int i = 1; i <= k; i++){
            if(temp == null)
            break;
            x = temp.next;
            temp.next = top;
            top = temp;
            temp = x;
        }
        ans = top;
        Top.next = x;
        top = null;
        while(temp != null){
            v = x;
            for(int i = 1; i <= k; i++){
                if(temp == null)
                break;
                x = temp.next;
                temp.next = top;
                top = temp;
                temp = x;
            }
            Top.next = top;
            Top = v;
            top = null;
        }
        return ans;
    }
}
