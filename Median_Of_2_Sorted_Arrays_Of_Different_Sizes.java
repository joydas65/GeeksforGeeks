class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        double v = 0;
        int i = 0, j = 0, c = 0;
        
        while(c < (m+n)/2 && i < n && j < m){
            if((m+n)%2 == 0 && c == ((m+n)/2)-1)
            break;
            if(a[i] < b[j]){
                c++; i++;
            }else if(a[i] > b[j]){
                c++; j++;
            }else{
                i++; j++; c += 2;
            }
        }
        
        if(c < (m+n)/2){
            if(i >= n){
                while(c < (m+n)/2 && j < m){
                    if((m+n)%2 == 0 && c == ((m+n)/2)-1)
                    break;
                    c++;
                    j++;
                }
            }else if(j >= m){
                while(c < (m+n)/2 && i < n){
                    if((m+n)%2 == 0 && c == ((m+n)/2)-1)
                    break;
                    i++;
                    c++;
                }
            }
        }
        
        if((m+n)%2 == 1){
            if(i >= n)
            return (double)b[j];
            
            if(j >= m)
            return (double)a[i];
            
            return (double)Math.min(a[i],b[j]);
        }else{
            if(i >= n)
            return ((double)b[j] + (double)b[j+1])/2;
            
            if(j >= m)
            return ((double)a[i] + (double)a[i+1])/2;
            
            v = (double)Math.min(a[i],b[j]);
            if(v == a[i]){
                if(i+1 >= 0 && i+1 < n)
                return (v + (double)Math.min(a[i+1],b[j]))/2;
                return (v + (double)b[j])/2;
            }else{
                if(j+1 >= 0 && j+1 < m)
                return (v + (double)Math.min(b[j+1],a[i]))/2;
                return (v + (double)a[i])/2;
            }
        }
    }
}
