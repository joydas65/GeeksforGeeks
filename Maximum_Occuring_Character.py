def getMaxOccurringChar(s):
    #code here
    
    arr = []
    
    d = dict()
    
    for i in s:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    ans = 0
    
    for i in d:
        
        ans = max(ans, d[i])
        
    for i in d:
        
        if ans == d[i]:
        
            arr.append(ord(i))
            
    return chr(min(arr))
