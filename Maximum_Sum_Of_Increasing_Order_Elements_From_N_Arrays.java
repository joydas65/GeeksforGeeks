class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int temp = -1, mx = Integer.MIN_VALUE, ans = 0;
        for(int i = 0; i < m; i++){
            mx = Math.max(mx, arr[n-1][i]);
        }
        temp = mx; ans = mx;
        for(int i = n-2; i >= 0; i--){
            mx = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++){
                if(arr[i][j] < temp && mx < arr[i][j])
                mx = arr[i][j];
            }
            
            if(mx == Integer.MIN_VALUE)
            return 0;
            else
            ans += mx;
            temp = mx;
        }
        
        return ans;
    }
    
}
