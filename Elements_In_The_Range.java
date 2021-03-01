class Solution
{
    boolean check_elements(long arr[], int n, int A, int B)
    {
        long s = ((B-A+1)*((2*A) + (B-A)))/2;
        HashSet<Long> an = new HashSet<Long>();
        for(long item : arr){
            if(item >= (long)A && item <= (long)B && !an.contains(item)){
                s -= item;
                an.add(item);
            }
            
            if(s <= 0)
            break;
        }
        
        return s == 0 ? true : false;
    }
}
