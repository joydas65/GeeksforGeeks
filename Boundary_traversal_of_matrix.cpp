void boundaryTraversal(int n1, int m1, int arr[SIZE][SIZE]){
    
    // Your code here
    for(int i = 0; i < m1; i++)
        cout<<arr[0][i]<<" ";
        
    if(n1 == 1)
        return;
        
    for(int i = 1; i < n1; i++){
        cout<<arr[i][m1-1]<<" ";
    }
    
    for(int i = m1-2; i >= 0; i--)
        cout<<arr[n1-1][i]<<" ";
        
    for(int i = n1 - 2; i >= 1; i--){
        cout<<arr[i][0]<<" ";
    }
}
