def convertToBinary(n):
    
    ans = ""
    
    while n != 0:
        
        ans = str(n%2) + ans
        
        n //= 2
        
    #print(ans)
        
    return ans


def grayToBinary(n):
    ##Your code here
    
    num = convertToBinary(n)
    
    #print(num)
    
    prev,ans = "",""
    
    for i in num:
        
        prev = str(i)
        ans = str(i)
        break
    
    #ans = str(num[0])
    
    for i in range(1,len(num)):
        
        if num[i] == '0':
            
            ans += prev
            
        else:
            
            if prev == "0":
                
                ans += "1"
                
                prev = "1"
                
            else:
                
                ans += "0"
                
                prev = "0"
                
    #print(ans)
                
    x = len(ans)-1
    y = 0
                
    for i,j in enumerate(ans):
        
        y += (2**(x-i)) * int(j)
                
    return y
    
