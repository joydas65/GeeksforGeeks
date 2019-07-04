def findSum(s):
    #code here
    
    flag,x,ans = 0,"",0
    
    for i in s:
        
        if i >= '0' and i <= '9':
            
            x += i
            
            flag = 1
            
        else:
            
            if flag == 1:
                
                ans += int(x)
                
                x = ""
                
            flag = 0
            
    return ans if x == "" else ans+int(x)
