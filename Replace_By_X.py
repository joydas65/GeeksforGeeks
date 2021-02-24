for _ in range(int(input())):
    
    s = input()
    
    pattern = input()
    
    n,m = len(s),len(pattern)
    
    if m > n:
        
        print(s)
        
    else:
        
        i,ans = 0,""
        
        while i < n:
            
            j,k = i,0
            
            while j < (i + m) and j < n and s[j] == pattern[k]:
                
                j += 1
                
                k += 1
                
            if k == m:
                
                if ans == "" or ans[-1] != "X":
                    
                    ans += "X"
                    
                i += m
                    
            else:
                
                ans += s[i]
                
                i += 1
                
        print(ans)
