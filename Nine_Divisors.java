class Solution{
    
    static long nineDivisors(long N){
        //Code Here
        //System.out.println((int)Math.sqrt(N));
        
        int ub = (int)Math.sqrt(N);
        
        int prime[] = new int[ub + 1];
        
        for(int i = 1; i <= ub; i++){
            prime[i] = i;
        }
        
        for(int i = 2; i*i <= ub; i++){
            if(prime[i] == i){
                for(int j = i*i; j <= ub; j += i){
                    if(prime[j] == j)
                    prime[j] = i;
                }
            }
        }
        
        int c = 0;
        
        for(int i = 2; i <= ub; i++){
            int p = prime[i];
            
            int q = prime[i / prime[i]];
            
            if(p*q == i && q != 1 && p != q)
            c++;
            else if(prime[i] == i){
                if(Math.pow(i, 8) <= N)
                c++;
            }
        }
        
        return c;
    }
}
