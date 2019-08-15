void print(int mat[][100],int n)
{
    // Your code here
    
    int row = 0;
    
    while(row < n){
        if(row % 2 == 0){
            for(int i = 0; i < n; i++){
                cout<<mat[row][i]<<" ";
            }
        }else{
            for(int i = n-1; i >= 0; i--){
                cout<<mat[row][i]<<" ";
            }
        }
        row++;
    }
}
