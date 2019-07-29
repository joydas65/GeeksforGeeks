for _ in range(int(input())):
    
    n = int(input())
    
    nuts = input().split()
    
    bolts = input().split()
    
    nuts_hash,bolts_hash = set(),set()
    
    for i in nuts:
        
        nuts_hash.add(i)
        
    for i in bolts:
        
        bolts_hash.add(i)
        
    nuts_ans,bolts_ans =[],[]
        
    for i in "!#$%&*@^~":
        
        if i in nuts_hash and i in bolts_hash:
            
            nuts_ans.append(i)
            
            bolts_ans.append(i)
            
    for i in nuts_ans:
        
        print(i,end = " ")
        
    print()
    
    for i in bolts_ans:
        
        print(i,end = " ")
        
    print()
            
            
