class Intersect
{
    public static int getNumberOfNodes(Node n){
        int ans = 0;
        while(n != null){
            ans += 1;
            n = n.next;
        }
        return ans;
    }
    public static int getIntersectionNode(int d, Node n1, Node n2){
        int i; 
        Node current1 = n1; 
        Node current2 = n2; 
        for (i = 0; i < d; i++) { 
            if (current1 == null) { 
                return -1; 
            } 
            current1 = current1.next; 
        } 
        while (current1 != null && current2 != null) { 
            if (current1.data == current2.data) { 
                return current1.data; 
            } 
            current1 = current1.next; 
            current2 = current2.next; 
        } 
  
        return -1;
    }
	int intersectPoint(Node headA, Node headB)
	{
         // code here
        int x = getNumberOfNodes(headA);
        int y = getNumberOfNodes(headB);
        //int d = 0;
        if (x > y) {
            return getIntersectionNode(x-y, headA, headB); 
        } 
        else { 
            return getIntersectionNode(y-x, headB, headA); 
        } 
	}
}
