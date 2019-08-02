def subArraySum(arr, n, s):
    #Your code here
    
    ans,x,d = 0,0,dict()
    
    for i in arr:
        
        x += i
        
        if x == s:
            
            ans += 1
            
        if x - s in d:
            
            ans += d[x-s]
            
        if x in d:
            
            d[x] += 1
            
        else:
            
            d[x] = 1
            
    return ans
