class Stacks
{
    // sq is the object of class TwoStack
    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        int n = sq.top1;
        sq.arr[++n] = x;
        sq.top1 = n;
    }
    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        int n = sq.top2;
        sq.arr[--n] = x;
        sq.top2 = n;
    }
    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(TwoStack sq)
    {
        if(sq.top1 == -1)
        return -1;
        int val = sq.arr[sq.top1];
        sq.top1--;
        return val;
    }
    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(TwoStack sq)
    {
        if(sq.top2 == 100)
        return -1;
        int val = sq.arr[sq.top2];
        sq.top2++;
        return val;
    }
}
