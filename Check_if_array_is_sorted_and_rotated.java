class SortedRotated{    
    
    // Function to check if array is sorted and rotated
    // arr[]: input array
    // num: size of array
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        
        if(num == 1)
        return true;
        
        int i = 1;
        
        //boolean asc = false, desc = false;
        
        //HashSet<Integer> val = new HashSet<Integer>();
        
        if(arr[0] > arr[1]){
            
            int maxVal = arr[0];
            
            while(i < arr.length && arr[i] < arr[i-1]){
                i++;
            }
            
            if(i == arr.length)
            return false;
            
            if(arr[i] < maxVal)
            return false;
            
            i += 1;
            while(i < arr.length && maxVal < arr[i] && arr[i] < arr[i-1]){
                i++;
            }
            
            if(i == arr.length)
            return true;
            return false;
            
        }else{
            
            int minVal = arr[0];
            
            while(i < arr.length && arr[i] > arr[i-1]){
                i++;
            }
            
            if(i == arr.length)
            return false;
            
            if(arr[i] > minVal)
            return false;
            
            i+=1;
            
            while(i < arr.length && arr[i] < minVal && arr[i-1] < arr[i]){
                i++;
            }
            if(i == arr.length)
            return true;
            return false;
        }
        
    }
    
}
