class SortByProfit implements Comparator<Job>{
    public int compare(Job a, Job b){
        return b.profit - a.profit;
    }
}

class solve{
    void printJobScheduling(Job arr[], int n){
        // Your code here
        Arrays.sort(arr, new SortByProfit());
        int jobs=0,ans=0;
        
        boolean slot[] = new boolean[n];

        for (int i=0; i<n; i++)
                slot[i] = false;

        for (int i=0; i<n; i++)
        {
            for (int j=Math.min(n, arr[i].deadline)-1; j>=0; j--)
            {
                if (slot[j]==false)
                {
                    ans += arr[i].profit;
                    slot[j] = true; 
                    jobs += 1;
                    break;
                }
            }
        }

        // Print the result
        System.out.print(jobs+" "+ans);
    }
}
