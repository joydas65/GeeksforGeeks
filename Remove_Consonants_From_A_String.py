for _ in range(int(input())):
    
    s,flag = input(),False

    for item in s:
        
        if item not in ('a','e','i','o','u','A','E','I','O','U',' '):
            
            continue
        
        else:
            
            print(item,end="")
            
            flag = True
            
    if flag == False:
        
        print("No Vowel")
        
    else:
        
        print()
