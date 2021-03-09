class Solution:
    def recamanSequence(self, n):
        # code here
        arr,sequence = [0],set()
        
        for i in range(1,n):
            
            if arr[i-1] - i > 0 and arr[i-1]-i not in sequence:
                
                sequence.add(arr[i-1]-i)
                
                arr.append(arr[i-1]-i)
                
            else:
                
                arr.append(arr[i-1]+i)
                
                sequence.add(arr[i-1]+i)
                
        return arr
