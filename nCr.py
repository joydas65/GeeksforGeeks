cmbo = [[0 for j in range(801)] for i in range(1001)]

mod = (10 ** 9)+7

fact_arr = [0 for i in range(1001)]

fact_arr[0] = fact_arr[1] = 1

for i in range(2,1001):
    
    fact_arr[i] = fact_arr[i-1]*i
    
for i in range(1001):
    
    if i == 0:
        
        continue
    
    for j in range(801):
        
        if i >= j:
        
            cmbo[i][j] = ((fact_arr[i])//(fact_arr[j]*fact_arr[i-j]))%mod
            
for _ in range(int(input())):
    
    n,r = map(int, input().split())
    
    print(cmbo[n][r])
        
        
        
        
    
