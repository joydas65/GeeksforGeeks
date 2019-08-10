class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node x = null;
     Node temp = null;
       if(headA == null && headB != null)
       return headB;
       
       if(headA != null && headB == null)
       return headA;
       
       if(headA.data < headB.data){
           x = headA;
           temp = headA;
           headA = headA.next;
       }else if(headA.data > headB.data){
           x = headB;
           temp = headB;
           headB = headB.next;
       }else{
           x = headA;
           temp = headA;
           headA = headA.next;
           temp.next = headB;
           headB = headB.next;
           temp = temp.next;
       }
       while(headA != null && headB != null){
           if(headB.data < headA.data){
               temp.next = headB;
               headB = headB.next;
               temp = temp.next;
           }else if(headB.data > headA.data){
               temp.next = headA;
               headA = headA.next;
               temp = temp.next;
           }else{
               temp.next = headA;
               headA = headA.next;
               temp = temp.next;
               temp.next = headB;
               headB = headB.next;
               temp = temp.next;
           }
       }
       while(headA == null && headB != null){
           temp.next = headB;
           headB = headB.next;
           temp = temp.next;
       }
       while(headB == null && headA != null){
           temp.next = headA;
           headA = headA.next;
           temp = temp.next;
       }
       return x;
   } 
}
