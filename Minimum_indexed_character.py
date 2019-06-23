for _ in range(int(input())):
    
    s = input()
    
    x = input()
    
    d = dict()
        
    for i in range(len(s)):
        
        if s[i] not in d:
            
            d[s[i]] = i
            
    ans = 10**6
            
    for i in x:
        
        if i in d:
            
            ans = min(ans, d[i])
            
    if ans == 10**6:
        
        print("$")
        
    else:
        
        print(s[ans])
        
        
