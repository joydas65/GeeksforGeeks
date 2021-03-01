class Solution {
    int superPrimes(int n) {
        if(n < 5)
        return 0;
        // code here
        boolean sieve[] = new boolean[n+1];
        
        for(int i = 1; i <= n; i++){
            sieve[i] = true;
        }
        
        sieve[0] = sieve[1] = false;
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int i = 2; i*i <= n; i++){
            if(sieve[i] == true){
                for(int j = i*i; j <= n; j += i){
                    if(sieve[j] == true)
                    sieve[j] = false;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(sieve[i] == true)
            primes.add(i);
        }
        
        int x = primes.size(), ans = 0;
        
        for(int i = 2; i < x; i++){
            if(primes.get(i) > n)
            break;
            int lo = 0, hi = i-1;
            while(lo <= hi){
                int a = primes.get(lo); int b = primes.get(hi);
                int c = primes.get(i);
                if(a + b > c)
                hi--;
                else if(a + b < c)
                lo++;
                else{
                    ans++;
                    break;
                }
            }
        }
        
        return ans;
    }
};
