class GfG
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> arr = new ArrayList<Integer>();
       
       Arrays.sort(arr2);
       
       for(int item : arr1){
           int lo = 0, hi = n-1, mid;
           
           while(lo <= hi){
               mid = lo + (hi - lo)/2;
               
               if(arr2[mid] > item)
               hi = mid - 1;
               else
               lo = mid + 1;
           }
           arr.add(lo);
       }
       return arr;
    }
}
