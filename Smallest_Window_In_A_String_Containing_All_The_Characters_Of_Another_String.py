for _ in range(int(input())):
    
    s = input()
    
    pat = input()
    
    m,n = len(s),len(pat)
    
    if n > m:
        
        print("-1")
        
    else:
        
        d = [0]*256
        
        x = [0]*256
        
        for i in pat:
            
            d[ord(i)] += 1
        
        c,start,min_len,start_index = 0,0,float('inf'),-1
            
        for i,j in enumerate(s):
            
            x[ord(j)] += 1
            
            if d[ord(j)] != 0 and x[ord(j)] <= d[ord(j)]:
                
                c += 1
            
            if c == n:
                
                while x[ord(s[start])] > d[ord(s[start])] or d[ord(s[start])] == 0:
                    
                    if x[ord(s[start])] > d[ord(s[start])]:
                        
                        x[ord(s[start])] -= 1
                        
                    start += 1
                    
                len_window = i - start + 1
                
                if min_len > len_window:
                    
                    min_len = len_window
                    
                    start_index = start
                    
        if start_index == -1:
            
            print("-1")
            
        else:
            
            print(s[start_index:start_index+min_len])
            
            
