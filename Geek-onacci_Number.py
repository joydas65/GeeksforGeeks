for _ in range(int(input())):
    
    a,b,c,n = map(int, input().split())
    
    while n-3 > 0:
        
        d = a+b+c
        
        a,b,c = b,c,d
        
        n -= 1
        
    print(c)
