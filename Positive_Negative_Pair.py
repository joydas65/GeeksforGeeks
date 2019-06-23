for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    arr1,arr2 = [],[]
    
    for i in arr:
        
        if i > 0:
            
            arr1.append(i)
            
        elif i < 0:
            
            arr2.append(i)
            
    arr1 = sorted(arr1)
    
    arr2 = sorted(arr2, reverse = True)
    
    i,j,x,y,flag = 0,0,len(arr1),len(arr2),0
    
    while i < x and j < y:
        
        if arr1[i] == abs(arr2[j]):
            
            print(arr1[i],arr2[j],end = " ")
            
            flag = 1
            
        i += 1
        
        j += 1
        
    if flag == 0:
        
        print("0")
        
    else:
        
        print()
