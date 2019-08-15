void sumTriangles(int n, int mat[SIZE][SIZE]){
    
    // Your code here
    
    int lower_sum = 0;
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            lower_sum += mat[i][j];
        }
    }
    
    int upper_sum = 0;
    
    for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){
            upper_sum += mat[i][j];
        }
    }
    cout<<upper_sum<<" "<<lower_sum;
}
