int global_ans = 10000001;

void findMin(int elem){
    if(elem < global_ans){
        global_ans = elem;
    }
}

void binSearch(int arr[], int left, int right){
    if(left == right)
    findMin(arr[left]);
    else{
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            if(arr[mid] < global_ans){
                global_ans = arr[mid];
                binSearch(arr, left, mid - 1);
                binSearch(arr, mid + 1, right);
                break;
            }else if(arr[mid] > global_ans){
                binSearch(arr, left, mid - 1);
                binSearch(arr, mid + 1, right);
                break;
            }else{
                break;
            }
        }
    }
}

int minNumber(int arr[], int low, int high)
{
    global_ans = 10000001;
    binSearch(arr, low, high);
    return global_ans;
    
}
