bool findTriplets(int arr[], int n)
{ 
    //Your code here
    
    int i = 0, j = 1, k = n - 1, flag = 0;
    
    sort(arr, arr+n);
    
    while(i < n){
        
        while(j < k){
            if(arr[i] + arr[j] + arr[k] == 0){
                flag = 1;
                break;
            }
            else if(arr[i] + arr[j] + arr[k] > 0)
            k--;
            else if(arr[i] + arr[j] + arr[k] < 0)
            j++;
        }
        if(flag == 1)
        break;
        i++;
        j = i + 1; k = n - 1;
    }
    
    if(flag == 1)
    return true;
    return false;
}
