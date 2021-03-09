for _ in range(int(input())):
    
    s = input()
    
    seen,c = set(),0
    
    for i in s:
        
        if i not in ('a','e','i','o','u') and i not in seen:
            
            c += 1
            
            seen.add(i)
            
    print("SHE!" if c % 2 == 0 else "HE!")
