for i in range(t):
    n = int(input())
    arv = []
    dpt = []
    arv = [j for j in map(int, input().strip().split())]
    dpt = [j for j in map(int, input().strip().split())]
    sor = []
    for j in range(n):
        sor.append(['a', arv[j]])
        sor.append(['d', dpt[j]])
    sor = sorted(sor, key = lambda x: x[1])    
    (res, maxi) = (0, 0)
    for j in range(2*n):
        if(sor[j][0] == 'a'):
            res += 1
        else:
            res -= 1
        maxi = max(maxi, res)    
    print(maxi)
