for _ in range(int(input())):
    
    n,m = map(int, input().split())
    
    ar1 = list(map(int, input().split()))
    
    ar2 = list(map(int, input().split()))
    
    print(len(set(ar1+ar2)))
