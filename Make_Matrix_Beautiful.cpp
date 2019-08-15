int findMax(int a, int b){
    return a>b?a:b;
}
int findMin(int a, int b){
    return a>b?b:a;
}
int findMinOpeartion(int matrix[][100], int n)
{
    //Your code here
    
    int rowSums[n];
    int colSums[n];
    
    for(int i = 0; i < n; i++){
        rowSums[i] = 0;
        colSums[i] = 0;
    }
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            rowSums[i] += matrix[i][j];
            colSums[j] += matrix[i][j];
        }
    }
    
    int ans = 0,maxSum = 0;
    
    for(int i = 0; i < n; i++){
        maxSum = findMax(maxSum, rowSums[i]);
        maxSum = findMax(maxSum, colSums[i]);
    }
    
    int i=0,j=0;
    
    while(i < n && j < n){
        int difference = findMin(maxSum - rowSums[i], maxSum - colSums[j]);
        
        matrix[i][j] += difference;
        
        rowSums[i] += difference;
        
        colSums[j] += difference;
        
        ans += difference;
        
        if(maxSum == rowSums[i])
        i++;
        
        if(maxSum == colSums[j])
        j++;
    }
    
    return ans;
}
