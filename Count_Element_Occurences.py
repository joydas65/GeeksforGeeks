def countOccurence(arr,n,k):
    #Your code here
    
    d = dict()
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    ans = 0
    
    for i in d:
        
        if d[i] > n//k:
            
            ans += 1
            
    return ans
