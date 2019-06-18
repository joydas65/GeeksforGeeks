int found = -1;

void terSearch(int arr[], int left, int right, int x){
    if(found != -1)
        return;
        
    if(right < left)
        return;
    
    int mid1 = left + (right - left)/3;
    int mid2 = right - (right - left)/3;
    
    if(arr[mid1] == x || arr[mid2] == x){
        found = (arr[mid1] == x)?mid1:mid2;
        return;
    }
    terSearch(arr, left, mid1 - 1, x);
    terSearch(arr, mid1 + 1, mid2 - 1, x);
    terSearch(arr, mid2 + 1, right, x);
}

int closer(int arr[],int n, int x)
{
    //Your code here
    found = -1;
    terSearch(arr,0,n-1,x);
    return found;
}
