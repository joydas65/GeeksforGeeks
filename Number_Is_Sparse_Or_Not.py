def isSparse(n):
    #Your code here 
    
    string_n = ""
    
    while n != 0:
        
        string_n = string_n + str(n%2)
        
        n //= 2
    
    for i in range(1,len(string_n)):
        
        if string_n[i] == '1' and string_n[i-1] == '1':
            
            return False
            
    return True
