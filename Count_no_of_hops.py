for _ in range(int(input())):
    
    n = int(input())
    
    dp = [0 for i in range(n+1)]
    
    if n == 1:
        
        print("1")
        
    elif n == 2:
        
        print("2")
        
    elif n == 3:
        
        print("4")
        
    else:
        
        dp[0],dp[1],dp[2],dp[3] = 0,1,2,4
        
        for i in range(4,n+1):
            
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3]
            
        print(dp[n])
