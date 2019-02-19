for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(str, input().split()))
    
    word = input()
    
    arr = sorted(arr,key = len,reverse = True)
    
    flag = 0
    
    while word != "":
    
        for i in arr:
            
            if i in word:
                
                substring_index = word.find(i)
        
                word = word[:substring_index] + word[substring_index + len(i):]
            
                flag = 1
                
        if flag == 0:
            
            break
            
        flag = 0
        
    print(word,arr)
            
    if word != "":
        
        print("0")
        
    else:
        
        print("1")
