for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    c,can = 1,arr[0]
    
    for i in arr:
        
        if c == 0:
            
            can = i
            
            c = 1
            
        else:
            
            if can == i:
                
                c += 1
                
            else:
                
                c -= 1
                
    if c == 0:
        
        print("-1")
        
    else:
        
        c = 0
        
        for i in arr:
            
            if i == can:
                
                c += 1
                
        if c > len(arr)//2:
            
            print(can)
            
        else:
            
            print("-1")
