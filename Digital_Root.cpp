int digitalRoot(int n)
{
    //Your code here
    
    int sum = 0;
    
    while(n != 0){
        sum += (n%10);
        n /= 10;
    }
    
    if(sum >= 0 && sum < 10)
    return sum;
    else
    return digitalRoot(sum);
}
