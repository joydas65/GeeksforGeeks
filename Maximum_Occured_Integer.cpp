int maxOccured(int L[], int R[], int n, int maxx){
    // Your code here
        int arr[maxx]; //= new int[1000000];
        
        for(int i = 0; i < maxx; i++){
            arr[i] = 0;
        }
        
        int ans = 0, val = arr[0];
        
        for(int i = 0; i < n; i++){
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
        }
        
        for(int i = 1; i < maxx; i++){
            arr[i] += arr[i-1];
            if(val < arr[i]){
                val = arr[i];
                ans = i;
            }
        }
        return ans;
}
