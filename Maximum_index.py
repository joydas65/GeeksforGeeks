for _ in range(int(input())):
    
    n = int(input())
    
    arr = list(map(int, input().split()))
    
    suru,ses = 0,n-1
    
    candidates = []
    
    while suru < n:
    
        while ses >= 0:

            if arr[suru] <= arr[ses]:

                candidates.append(ses - suru)

                break

            ses -= 1

        suru += 1
        
        ses = n-1
        
    print(max(candidates))


