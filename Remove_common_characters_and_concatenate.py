def concatenatedString(s,p):
    #code here
    
    s1,s2,ans = set(),set(),""
    
    for i in s:
        
        s1.add(i)
        
    for i in p:
        
        s2.add(i)
        
    for i in s:
        
        if i not in s2:
            
            ans += str(i)
            
    for i in p:
        
        if i not in s1:
            
            ans += str(i)
            
    return -1 if ans == "" else ans
    
