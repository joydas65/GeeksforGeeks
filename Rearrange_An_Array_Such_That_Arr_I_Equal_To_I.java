class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] modifyArray (int arr[], int n) {
        // Complete the function
        int ans[] = new int[n];
        
        Arrays.fill(ans, -1);
        
        for(int item : arr){
            if(item == -1)
            continue;
            ans[item] = item;
        }
        
        return ans;
    }
    
    
}
