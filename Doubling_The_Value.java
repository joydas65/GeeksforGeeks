class Solution
{
    long solve(int n, long A[], long b)
    {
        // Complete this function
        for(long item : A){
            if(item == b){
                b = b * 2;
            }
        }
        
        return b;
    }
}
