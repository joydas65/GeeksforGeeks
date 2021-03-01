double calculateNetForce(double mid, double magnets[], int n){
        double force = 0;
        for(int i = 0; i < n; i++){
            force += 1.0/(mid - magnets[i]);
        }
        
        return force;
}


void nullPoints(int n, double magnets[], double getAnswer[])
{
    // Your code goes here 
        double lo, hi, mid;
        int ind = -1;
        for(int i = 1; i < n; i++){
            lo = magnets[i-1]; hi = magnets[i];
            while(lo < hi){
                mid = (lo + hi)/2.0;
                double val = calculateNetForce(mid,magnets,n);
                if(abs(val) < 0.0000000000001){
                    getAnswer[++ind] = mid;
                    break;
                }
                if(val > 0)
                lo = mid;
                else
                hi = mid;
            }
        }
}
