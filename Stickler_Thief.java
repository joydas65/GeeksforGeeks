class solve{
    // Function to return maximum of sum without adjacent elements
    
    public int findMax(int a, int b, int c){
        return (a > b)&&(a > c)?a:(b > c)?b:c;
    }
    
    
    public int FindMaxSum(int arr[], int n){
        // Your code here
        if(n == 1)
        return arr[0];
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        int max_so_far = dp[1];
        for(int i = 2; i < n; i++){
            dp[i] = findMax(dp[i-2]+arr[i],arr[i],max_so_far);
            max_so_far = Math.max(max_so_far, dp[i]);
        }
        return max_so_far;
    }
}
