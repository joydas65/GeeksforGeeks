for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    x = input()
    
    y = input()
    
    dpArr = [[0 for j in range(m+1)] for i in range(n+1)]
    
    ans = 0
    
    for i in range(1,n+1):
        
        for j in range(1,m+1):
            
            if x[i-1] == y[j-1]:
                
                dpArr[i][j] = 1 + dpArr[i-1][j-1]
                
                ans = max(ans, dpArr[i][j])
                
            else:
                
                dpArr[i][j] = 0
                
    print(ans)
