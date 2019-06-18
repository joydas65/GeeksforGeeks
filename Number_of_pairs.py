def countPairs(a,b,m,n):
    #code here
    
    arr = [0 for i in range(1001)]
    
    for i in b:
        
        arr[i] += 1
        
    v = arr[3]
        
    for i in range(3,1001):
        
        arr[i] += arr[i-1]
        
    ans = 0
        
    for i in a:
        
        if i != 1:
        
            if i == 3:
                
                if n - v > 0:
                    
                    ans += (n - v)
                
            elif i == 2:
                
                if n - arr[4] > 0:
                    
                    ans += (n - arr[4])
                    
            else:
                
                if n - arr[i] > 0:
                    
                    ans += (n - arr[i])
                    
    return ans
