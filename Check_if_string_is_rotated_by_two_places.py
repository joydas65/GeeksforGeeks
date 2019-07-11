def isRotated(s,p):
    
    x,y = len(s),len(p)
    
    if x != y:
        
        return False
        
    flag = 0
        
    for i in range(2,x):
        
        if s[i] != p[i-2]:
            
            flag = 1
            break
        
    if flag == 1:
        
        for i in range(x-2):
            
            if s[i] != p[i+2]:
                
                return False
                
        if s[-2] != p[0]:
        
            return False
        
        if s[-1] != p[1]:
        
            return False
            
        return True
            
    if p[-2] != s[0]:
        
        return False
        
    if p[-1] != s[1]:
        
        return False
        
    return True
