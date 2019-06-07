class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    
    static int kadane(int a[], int n){
        
        int maxGlobal,maxCurrent,i;
        
        i = 1; 
        maxGlobal = maxCurrent = a[0];
        
        while(i < a.length){
            maxCurrent = Math.max(maxCurrent + a[i], a[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
            i += 1;
        }
        
        return maxGlobal;
    }
    
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        //return Integer.max(kadane(a,n), reverseKadane(a,n));
        
        int i = 0,c = 0,ans = 0;
        
        while(i < a.length && a[i] <= 0){
            c++;
            i++;
        }
        
        if(c == a.length){
            ans = a[0];
            for(i = 1; i < a.length; i++){
                ans = Math.max(ans, a[i]);
            }
            return ans;
        }
        
        n = a.length; 
        
        int max_kadane = kadane(a, n); 
  
        int max_wrap  =  0; 
        for (i = 0; i < n; i++) 
        { 
            max_wrap += a[i]; 
            a[i] = -a[i];  
        } 
  
        max_wrap = max_wrap + kadane(a, n); 
  
        return (max_wrap > max_kadane) ? max_wrap : max_kadane; 
    }
    
    
    
}
