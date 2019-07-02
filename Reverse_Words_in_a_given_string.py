def reverseWords(s):
    # code here
    
    arr,ans = s.split('.'),[]
    
    for i in arr:
        
        ans.append(i)
        
    for i in range(len(ans)-1,0,-1):
        
        print(ans[i],end=".")
        
    print(ans[0],end="")
