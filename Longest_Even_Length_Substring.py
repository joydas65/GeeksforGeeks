def findSumOfDigits(s):
    
    x = 0
    
    for i,j in enumerate(s):
        
        x += (ord(j)-48)
        
    return x

for _ in range(int(input())):
    
    s = input()
    
    n = len(s)
    
    x,k,flag = n//2,0,0
    
    while x > 0:
        
        if findSumOfDigits(s[k:k+x]) == findSumOfDigits(s[k+x:k+(2*x)]):
            
            print(2*x)
            
            flag = 1
            
            break
            
        k += 1
        
        if k+(2*x) > n:
            
            k = 0
            
            x -= 1
            
    if flag == 0:
        
        print(flag)
