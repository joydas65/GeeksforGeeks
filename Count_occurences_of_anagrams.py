for _ in range(int(input())):
    
    ans = 0
    
    s = input()
    
    word = input()
    
    f = dict()
    
    for i in word:
        
        if i in f:
            
            f[i] += 1
            
        else:
            
            f[i] = 1
    
    h,i = len(word),0
    
    ub = h-1
    
    while(ub < len(s)):
        
        d = dict()
        
        for j in range(i,ub+1):
            
            if s[j] in d:
                
                d[s[j]] += 1
                
            else:
                
                d[s[j]] = 1
                
        flag = 0
                
        for j in word:
            
            if j not in d:
                
                flag = 1
                
                break
            
            else:
                
                if f[j] != d[j]:
                    
                    flag = 1
                    
                    break
                
        if flag == 0:
            
            ans += 1
            
        i += 1
        ub += 1
            
    print(ans)
                
                
        
        
