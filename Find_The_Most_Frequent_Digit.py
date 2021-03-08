for _ in range(int(input())):
    
    n = input()
    
    d,mx,ans = dict(),0,-1
    
    for i in n:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in d:
        
        if mx < d[i]:
            
            mx,ans = d[i],ord(i)-48
            
        elif mx == d[i]:
            
            ans = max(ans, ord(i)-48)
            
    print(ans)
