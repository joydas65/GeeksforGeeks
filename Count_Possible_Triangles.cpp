long long findNumberOfTriangles(long long n)
{
    //Your code here
    sort(arr, arr+n);
    
    long long ans = 0;
    
    for(int i = 0; i < n-2; i++){
        int k = i + 2;
        for(int j = i + 1; j < n; j++){
            while(k < n && arr[i]+arr[j] > arr[k]){
                ++k;
            }
            
            if(k > j){
                ans += (k - j - 1);
            }
        }
    }
    
    return ans;
}
