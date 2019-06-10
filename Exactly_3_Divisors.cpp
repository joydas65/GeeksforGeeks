bool primalityTest(int n){
    if(n == 2 || n == 3 || n == 5)
    return true;
    if(n < 2)
    return false;
    if(n % 2 == 0 || n % 3 == 0)
    return false;
    
    for(int i = 5; i <= (int)sqrt(n); i+=6){
        if(n % i == 0 || (n % (i+2)) == 0)
        return false;
    }
    return true;
}

int exactly3Divisors(int N)
{
    //Your code here
    int ans = 0;
    
    for(int i = 2; i*i <= N; i++){
        if(primalityTest(i) == true)
        ans++;
    }
    return ans;
}
