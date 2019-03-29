class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       
       int dpArr[] = new int[n];
       
        Arrays.sort(arr,new Comparator<Pair>(){
        @Override
        public int compare(Pair c, Pair d) {
            return Integer.valueOf((c.y)).compareTo(Integer.valueOf(d.y));
        }
        });
       
       for(int i = 0; i < n; i++){
           dpArr[i] = 1;
       }
       
       for(int i = 1; i < n; i++){
           for(int j = 0; j < i; j++){
               if(arr[i].x > arr[j].y && dpArr[i] < dpArr[j] + 1){
                   dpArr[i] = dpArr[j]+1;
               }
           }
       }
       
       int ans = 0;
       
       for(int i = 0; i < n; i++){
           ans = Math.max(ans, dpArr[i]);
       }
       return ans;
    }
}
