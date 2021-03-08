for _ in range(int(input())):
    
    arr = list(map(str, input().split()))
    
    c = 0
    
    for word in arr:
        
        for i,j in enumerate(word):
            
            if ord(j) >= 97 and ord(j) <= 122:
                
                c += ord(j) - 97 + i
                
            elif ord(j) >= 48 and ord(j) <= 57:
                
                if ord(j) > 48:
                
                    c += ord(j) - 23 + i
                    
                else:
                    
                    c += (i + 35)
                
            elif ord(j) >= 65 and ord(j) <= 90:
                
                c += ord(j) - 29 + i
                
    print(c * len(arr))
