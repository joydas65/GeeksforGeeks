class Solution
{
    ArrayList<Long> smallestDifferenceTriplet(long a[],long b[],long c[],long n)
    {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int i = 0, j = 0, k = 0;
        
        long maxVal,minVal,x=0,y=0,z=0;
        
        long diff = Integer.MAX_VALUE;
        
        while(i < n && j < n && k < n){
            maxVal = Math.max(Math.max(a[i], b[j]), c[k]);
            
            minVal = Math.min(Math.min(a[i], b[j]), c[k]);
            
            if(diff > (maxVal - minVal)){
                diff = maxVal - minVal;
                
                x = a[i]; y = b[j]; z = c[k];
            }
            
            if(minVal == a[i])
            i++;
            else if(minVal == b[j])
            j++;
            else
            k++;
        }
        
        ArrayList<Long> ans = new ArrayList<Long>();
        
        maxVal = Math.max(Math.max(x, y), z);
        
        minVal = Math.min(Math.min(x, y), z);
        
        ans.add(maxVal);
        ans.add((x+y+z)-(maxVal+minVal));
        ans.add(minVal);
        
        return ans;
    }
}
