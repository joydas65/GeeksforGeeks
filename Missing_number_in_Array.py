for i in range(t):
    
    n = int(input())
    
    l = list(map(int, input().split()))
    
    temp = (n * (n + 1))//2
    
    print(temp - sum(l))
