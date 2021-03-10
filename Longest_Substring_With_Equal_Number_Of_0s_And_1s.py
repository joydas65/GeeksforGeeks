for _ in range(int(input())):
    
    s = input()
    
    c0,c1,d,ans = 0,0,dict(),-1
    
    d[0] = -1
    
    for i,j in enumerate(s):
        
        if j == '0':
            
            c0 += 1
            
        else:
            
            c1 += 1
            
        if c1-c0 in d:
            
            ans = max(ans, i - d[c1-c0])
            
        else:
            
            d[c1-c0] = i
            
    print(ans)
