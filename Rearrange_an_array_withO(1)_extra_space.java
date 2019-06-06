class rearrange
{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        for(int i = 0; i < n; i++){
            arr[i] += (arr[(int)arr[i]]%n)*n;
        }
        
        for(int i = 0; i < n; i++){
            arr[i] = arr[i]/n;
        }
    }
}
