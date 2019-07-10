def compute(s,arr,pos,ans,fact_arr,n,temp):
    
    if pos > n:
        
        return ans + 1
    
    val,traverse = 0,0
    
    while s[pos-1] != arr[val]:
        
        if temp[val] == 0:
            
            traverse += 1
            
        val += 1
            
    temp[val] = 1
        
    return compute(s,arr,pos+1,ans + (traverse*fact_arr[n-pos]),fact_arr,n,temp)


def findRank(s):
    
    arr,n,x = [],0,set()
    
    for i in s:
        
        if i in x:
            
            return 0
        
        x.add(i)
        
        arr.append(i)
        
        n += 1
        
    arr,d = sorted(arr),dict()
    
    for i in range(1,n+1):
        
        d[arr[i-1]] = i
        
    fact_arr = [1]
    
    for i in range(1,16):
        
        fact_arr.append(i * fact_arr[i-1])
        
    temp = []
    
    for i in range(n):
        
        temp.append(0)
    
    #print(d,arr)
    
    return compute(s,arr,1,0,fact_arr,n,temp)
