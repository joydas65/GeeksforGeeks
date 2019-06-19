for _ in range(int(input())):
    
    s1,s2 = map(str, input().split())
    
    x,y,n,m = 0,0,len(s1),len(s2)
    
    while x < n and y < m:
        
        if s2[y] == s1[x]:
            
            x += 1
            
        y += 1
        
    if x == n:
        
        print("1")
        
    else:
        
        print("0")
