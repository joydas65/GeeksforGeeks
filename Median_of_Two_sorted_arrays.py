for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    arr1 = list(map(int, input().split()))
    
    arr2 = list(map(int, input().split()))
    
    arr = []
    
    mid,c,x,y = ((n+m)//2)+1,0,0,0
    
    while c < mid and x < n and y < m:
        
        if arr1[x] < arr2[y]:
            
            arr.append(arr1[x])
            
            x += 1
            
            c += 1
            
        elif arr2[y] < arr1[x]:
            
            arr.append(arr2[y])
            
            y += 1
            
            c += 1
            
        else:
            
            arr.append(arr1[x])
            
            arr.append(arr2[y])
            
            x += 1
            
            y += 1
            
            c += 2
            
    if c >= mid:
        
        if (n+m)%2 == 1:
            
            print(arr[mid-1])
            
        else:
            
            print((arr[mid-1]+arr[mid-2])//2)
            
    else:
        
        while c < mid and x == n and y < m:
            
            arr.append(arr2[y])
            y += 1
            c += 1
            
        while c < mid and y == m and x < n:
            
            arr.append(arr1[x])
            
            x += 1
            c += 1
            
        if (n+m)%2 == 1:
            
            print(arr[mid-1])
            
        else:
            
            print((arr[mid-1]+arr[mid-2])//2)
