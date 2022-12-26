class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] arr = new long[N-K+1];
        List<Integer> indices = new ArrayList<>();
        
        int idx = -1, j = 0;
        
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                indices.add(i);
            }
        }
        
        for (int i = 0; i <= (N-K); i++) {
            
            if (j >= indices.size()) {
                arr[++idx] = 0;
                continue;
            }
            
            int x = indices.get(j);
            if (x >= i && x < i+K) {
                arr[++idx] = A[x];
                if (x == i) j++;
            } else {
                arr[++idx] = 0;
            }
        }
        
        return arr;
    }
}
