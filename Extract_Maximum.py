for _ in range(int(input())):
    
    s = input()
    num,ans = 0,0
    
    for i in s:
        
        if ord(i) >= 48 and ord(i) <= 57:
            
            num = (num * 10) + (ord(i) - 48)
            
        else:
            
            ans = max(ans, num)
            num = 0
            
    print(max(ans, num))
