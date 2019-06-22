def countSubarrWithEqualZeroAndOne(arr, n):
    #Your code here
    
    d,s,ans = dict(),0,0
    
    d[0] = 1
    
    for i in arr:
        
        if i == 0:
            
            s -= 1
            
            if s in d:
                
                d[s] += 1
                
            else:
                
                d[s] = 1
                
        else:
            
            s += 1
            
            if s in d:
                
                d[s] += 1
                
            else:
                
                d[s] = 1
                
    for i in d:
        
        if d[i] > 1:
            
            ans += (d[i] * (d[i] - 1))//2
            
    return ans
                
        
    
