int findMax(int a, int b){
    return a>b?a:b;
}
int findMaxFromSubArray(int *arr, int lb, int ub){
    int ans = arr[lb];
    for(int i = lb + 1; i < ub; i++){
        ans = findMax(ans, arr[i]);
    }
    return ans;
}
void max_of_subarrays(int *arr, int n, int k){
    // your code here
    int ans = arr[0];
    for(int i=0;i<k;i++){
        ans = findMax(ans, arr[i]);
    }   
    cout<<ans<<" ";
    for(int i=k;i<n;i++){
        if(arr[i] > ans){
            cout<<arr[i]<<" ";
            ans = arr[i];
        }else{
            if(arr[i-k] == ans){
                ans = findMaxFromSubArray(arr,i-k+1,i+1);
                cout<<ans<<" ";
            }else{
                cout<<ans<<" ";
            }
        }
    }
}
