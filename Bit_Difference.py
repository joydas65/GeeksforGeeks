def countBitsFlip(a,b):
    ##Your code here
    ans = 0
    while a != 0 or b != 0:
        
        if a%2 != b%2:
            
            ans += 1
            
        a //= 2
        
        b //= 2
        
    return ans
