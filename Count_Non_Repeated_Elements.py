def countNonRepeated(arr,n):
    #Your code here
    
    d,ans = dict(),0
    
    for i in arr:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in d:
        
        if d[i] == 1:
            
            ans += 1
            
    return ans
