class MaxDifference{
    
    // Function to find maximum difference of j-1
    // arr[]: input array
    // n: size of array
    static int maxIndexDiff(int arr[], int n){ 
        
        // Your code here
        
        int ans = 0,end = n-1,front = 0;
        
        while(ans < (n-1-front)){
            end = n-1;
            while(front < end){
                if(arr[front] <= arr[end]){
                    ans = Math.max(ans, end - front);
                    break;
                }
                end--;
            }
            front++;
        }
        return ans;
    }
}
