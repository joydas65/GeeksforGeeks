for _ in range(int(input())):
    
    n = int(input())
    
    ar = list(map(int, input().split()))
    
    temp,arr,c = [],[],0
    
    for i in ar:
        
        temp.append(i)
        
        c += 1
        
        if c == n:
            
            arr.append(temp)
            
            temp = []
            
            c = 0
            
    for i in range(n):
        
        row,col = 0,i
        
        while row < n and col >= 0:
            
            print(arr[row][col],end = " ")
            
            row += 1
            
            col -= 1
            
    for i in range(1,n):
        
        row,col = i,n-1
        
        while row < n and col >= 0:
            
            print(arr[row][col],end = " ")
            
            row += 1
            
            col -= 1
            
    print()
