prime = [True for i in range(1000001)] 
primes = []
primes_len = 0
p = 2
while (p * p <= 1000000): 
          
    if (prime[p] == True): 
              
        for i in range(p * p, 1000001, p): 
            prime[i] = False
    p += 1
    
for p in range(2, 1000001): 
    if prime[p]:
        primes.append(p)
        primes_len += 1
        
#print(primes)

for _ in range(int(input())):
    
    n = int(input())
    
    i,j = 0,primes_len - 1
    
    while i <= j:
        
        if primes[i] + primes[j] == n:
            
            break
        
        elif primes[i] + primes[j] > n:
            
            j -= 1
            
        else:
            
            i += 1
        
    if i > j:
        
        print(-1)
        
    else:
        
        print(primes[i],primes[j])
