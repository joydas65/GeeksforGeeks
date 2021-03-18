for _ in range(int(input())):
    
    s = input()
    
    n,d,odd = len(s),dict(),0
    
    for i in s:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    for i in d:
        
        if d[i] % 2 == 1:
            
            odd += 1
        
    print("Yes" if (n % 2 == 0 and odd == 0) or (n % 2 == 1 and odd == 1) else "No")
