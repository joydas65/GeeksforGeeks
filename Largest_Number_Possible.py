for _ in range(int(input())):
    
    n,s = map(int, input().split())
    
    if n == 1:
        
        if s >= 0 and s <= 9:
        
            print(s)
            
        else:
            
            print("-1")
        
    elif s == 0:
        
        print("-1")
        
    else:
    
        assign,num,ans,d = 9,0,0,0
        
        while d < n and num <= s:
            
            assign = 9
            
            if num+assign <= s:
                
                ans = (ans*10) + assign
                
                num += assign
                
                d += 1
                
            else:
                
                assign = s - num
                
                ans = (ans * 10) + assign
                
                d += 1
                
                num += (s - num)
                
        x = 0
        
        for i in str(ans):
            
            x += (ord(i)-48)
            
        if x == s:
            
            print(ans)
            
        else:
            
            print("-1")
        
        
