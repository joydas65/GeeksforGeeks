class Solution:
    def numberOfPaths (self, n, m):
        # print(a)
        pass
        # code here
        arr = [1]
        
        for i in range(1,21):
            
            arr.append(arr[-1] * i)
            
        return (arr[m + n - 2])//(arr[n - 1] * arr[m - 1])
