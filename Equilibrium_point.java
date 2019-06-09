class EquilibriumPoint{
    
    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n){
        
        // Your code here
        
        if(n == 1)
        return 1;
        
        int i=0;
        
        for(i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        
        for(i = 1; i < arr.length; i++){
            if(arr[i-1] == (arr[arr.length - 1] - arr[i])){
                break;
            }
        }
        
        if(i < arr.length)
        return i+1;
        return -1;
    }
    
}
