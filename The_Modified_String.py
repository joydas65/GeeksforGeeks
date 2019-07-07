def modified(s):
    #code here
    
    x,c,ans = len(s),1,0
    
    for i in range(x):
        
        if i+1 < x:
            
            if s[i] == s[i+1]:
                
                c += 1
                
                if c >= 3:
                    
                    ans += 1
                    
                    c -= 2
                    
            else:
                
                c = 1
                
    if c >= 3:
        
        ans += 1
                
    return ans
            
            
