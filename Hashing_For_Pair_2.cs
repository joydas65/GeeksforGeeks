class Gfg
{
    //Complete this code
    public int sumExists(int[] arr, int sizeOfArray, int sum)
    {
        //Your code here
        HashSet<int> seen = new HashSet<int>();
        for(int i = 0; i < sizeOfArray; i++){
            if(seen.Contains(sum - arr[i]))
            return 1;
            seen.Add(arr[i]);
        }
        return 0;
    }
}
