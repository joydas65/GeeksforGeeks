for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    arr1 = list(map(int, input().split()))
    
    arr2 = list(map(int, input().split()))
    
    d = dict()
    
    for i in arr1:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
            
    flag = 0
            
    for i in arr2:
        
        if i not in d or d[i] == 0:
            
            flag = 1
            
            break
        
    if flag == 1:
        
        print("No")
        
    else:
        
        print("Yes")
        
        
