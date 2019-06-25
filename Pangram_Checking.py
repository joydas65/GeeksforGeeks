def checkPanagram(s):
    #code here
    
    s = s.lower()
    
    d = dict()
    
    for i in "abcdefghijklmnopqrstuvwxyz":
        
        d[i] = 0
        
    for i in s:
        
        if i in d:
            
            d[i] += 1
            
    for i in d:
        
        if d[i] == 0:
            
            return 0
            
    return 1
