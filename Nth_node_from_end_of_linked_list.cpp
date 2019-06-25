int getNthFromLast(Node *head, int n)
{
       // Your code here
       Node *temp = head;
       int c = 0;
       while(temp != NULL && c < n){
           temp = temp->next;
           c++;
       }
       if(temp == NULL && c < n)
       return -1;
       
       if(temp == NULL && c == n)
       return head->data;
       
       Node *nd = head;
       
       while(temp != NULL){
           nd = nd->next;
           temp = temp->next;
       }
       return nd->data;
}
