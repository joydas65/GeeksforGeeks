int findMin(int a, int b){
    return a<b?a:b;
}

stack<int>_push(int arr[],int n)
{
   // your code here
   stack<int> s;
   
   s.push(arr[0]);
   
   for(int i = 1; i < n; i++){
       s.push(findMin(arr[i], s.top()));
   }
   
   return s;
}
/* print minimum element of the stack each time
   after popping
*/
void _getMinAtPop(stack<int>s)
{
    // your code here
    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
}
