class Solution{
    static int minJumps(int[] arr){
        // your code here
        
        int n = arr.length, min;
        
        if (n <= 1) return 0;
        
        if (arr[0] == 0) return -1;
        
        int jump = 1, steps = arr[0], maxJump = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (i >= n-1) return jump;
            
            maxJump = Math.max(maxJump, i + arr[i]);
            
            steps--;
            
            if (steps == 0) {
                jump++;
                
                if (i >= maxJump) return -1;
                
                steps = maxJump - i;
            }
        }
        
        return -1;
    }
}
