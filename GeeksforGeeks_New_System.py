for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(str, input().split()))
    
    word = dict()
    
    for item in arr:
        
        if item not in word:
            
            print("Verified",end = " ")
            
            word[item] = 1
            
        else:
            
            print(item+str(word[item]),end = " ")
            
            word[item] += 1
            
    print()
