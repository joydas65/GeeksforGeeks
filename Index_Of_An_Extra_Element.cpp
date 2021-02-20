int findExtra(int a[], int b[], int n) {
    // add code here.
    int i = 0;
    
    while(i < n-1 && a[i] == b[i]){
        i++;
    }
    
    return i;
}
