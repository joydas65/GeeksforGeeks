class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int arr[], int size)
    {
        
        // Your code here
        // You can add utility functions (if required)
        
        Set<Integer> numbers = new HashSet<Integer>();
        
        for(int i : arr){
            numbers.add(i);
        }
        
        int i = 1;
        
        while(true){
            if(!numbers.contains(i)){
                break;
            }
            i++;
        }
        return i;
    }
    
}
