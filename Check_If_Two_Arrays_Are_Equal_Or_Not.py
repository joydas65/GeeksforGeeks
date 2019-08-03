for _ in range(int(input())):
    
    n = int(input())
    
    a = list(map(int, input().split()))
    
    b = list(map(int, input().split()))
    
    d1,d2 = dict(),dict()
    
    for i in a:
        
        if i in d1:
            
            d1[i] += 1
            
        else:
            
            d1[i] = 1
            
    for i in b:
        
        if i in d2:
            
            d2[i] += 1
            
        else:
            
            d2[i] = 1
            
    flag = 0
    for i in d1:
        
        if i not in d2:
            
            flag = 1
            
            break
        
        else:
            
            if d1[i] != d2[i]:
                
                flag = 1
                
                break
            
    if flag == 0:
        
        print("1")
        
    else:
        
        print("0")
