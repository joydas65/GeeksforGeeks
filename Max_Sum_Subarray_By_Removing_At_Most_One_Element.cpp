int findMax(int a, int b){
    return a>b?a:b;
}
int maxSumSubarray(int A[], int n)
{
    //Your code here
    int forward[n],backward[n];
    
    int maxCurrent,maxGlobal;
    maxCurrent = maxGlobal = A[0];
    
    forward[0] = maxCurrent;
    
    for(int i = 1; i < n; i++){
        maxCurrent = findMax(A[i], A[i]+maxCurrent);
        maxGlobal = findMax(maxGlobal, maxCurrent);
        forward[i] = maxCurrent;
    }
    
    for(int i = 0; i < n; i++){
        backward[i] = 0;
    }
    
    backward[n-1] = A[n-1];
    maxCurrent = maxGlobal = A[n-1];
    
    for(int i = n-2; i >= 0; i--){
        maxCurrent = findMax(A[i], A[i]+maxCurrent);
        maxGlobal = findMax(maxGlobal, maxCurrent);
        backward[i] = maxCurrent;
    }
    
    for(int i = 1; i < n-1; i++){
        maxGlobal = findMax(maxGlobal, forward[i-1]+backward[i+1]);
    }
    
    /*for(int i = 0; i < n; i++){
        cout<<forward[i]<<" "<<backward[i]<<endl;
    }*/
    return maxGlobal;
}
