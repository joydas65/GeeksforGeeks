def Anagrams(words,n):
    
    #code here
    d,ans = dict(),[]
    
    for i in words[0]:
        
        if i in d:
            
            d[i] += 1
            
        else:
            
            d[i] = 1
    
    ans = [d]
    
    wrds = [[words[0]]]
    
    for i,j in enumerate(words):
        
        if i >= 1:
            
            temp = dict()
            
            for k in j:
                
                if k in temp:
                    
                    temp[k] += 1
                    
                else:
                    
                    temp[k] = 1
                    
            flag = 0
            
            for ind,hmap in enumerate(ans):
                
                flag = 0
                
                for k in temp:
                    
                    if k not in hmap or hmap[k] != temp[k]:
                        
                        flag = 1
                        
                        break
                    
                if flag == 0:
                    
                    wrds[ind].append(j)
                    
                    break
                
            if flag == 1:
                
                wrds.append([j])
                
                ans.append(temp)
                
    #print(wrds)
    
    return wrds
