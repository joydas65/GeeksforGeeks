for _ in range(int(input())):
    
    k = int(input())
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    arr = sorted(arr)
    
    #print(arr)
    
    v1,v2 = min(arr),max(arr)
    
    if v2-v1 >= k:
        
        arr[0] += k
        
        arr[-1] -= k
        
    else:
        
        arr[0] += k
        
        arr[-1] += k
        
    v1,v2 = min(arr[0],arr[-1]),max(arr[0],arr[-1])
    
    for i in range(1,n-1):
        
        if arr[i]+k >= v1 and arr[i]+k <= v2:
            
            arr[i] += k
            
        elif arr[i]-k >= v1 and arr[i]-k <= v2:
            
            arr[i] -= k
            
        else:
            
            val1,val2 = arr[i]+k,arr[i]-k
            
            if val1-v1 < v2-val2:
                
                v2,arr[i] = val1,arr[i]+k
                
            elif val1-v1 > v2-val2:
                
                v1,arr[i] = val2,arr[i]-k
                
            else:
                
                v2,arr[i] = val1,arr[i]+k
                
    print(max(arr)-min(arr))
    #print(arr)
