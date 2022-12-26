for _ in range(int(input())):
    
    a,b,c = map(int, input().split())
    
    freq = 0
    
    while (a <= c and b <= c):
        
        if a == min(a,b):
            
            a += b
            
        elif b == min(a,b):
            
            b += a
            
        freq += 1
        
    print(freq)
