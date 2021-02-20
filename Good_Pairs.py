for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    c = 0
    
    for i in range(n):
        
        for j in range(n):
            
            if arr[i] < arr[j]:
                
                c += 1
                
    print(c)
