void pairWiseSwap(struct node *head)
{
  // The task is to complete this method
  struct node *x = head;
  struct node *x_next;
  struct node *x_prev = NULL;
  struct node *temp;
  int c=0;
  if(!head || !head->next)
  return;
  head = head->next;
    while(x != NULL){
        x_next = x->next;
        if(x_next == NULL)
        break;
               
        temp = x_next->next;
               
        x->next = x_next->next;
        x_next->next = x;
        if(c >= 1)
        x_prev->next = x_next;
               
        c++;
            
        x_prev = x;
        x = temp;
    }
    printf("%d ",head->data);
}
