class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        long power_of_5 = 5;
        int count = 0; long n = (long) N;
        
        while (n >= power_of_5) {
            count += (n / power_of_5);
            power_of_5 *= 5;
        }
        
        return count;
    }
}
