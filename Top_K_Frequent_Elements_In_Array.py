class Solution:
	def topK(self, nums, k):
	    d = dict()
		#Code here
		for i in nums:
		    
		    if i in d:
		        
		        d[i] += 1
		        
		    else:
		        
		        d[i] = 1
	    
	    arr = []
	    
	    for i in d:
	        
	        arr.append([d[i],i])
	        
	    arr = sorted(arr, reverse = True)
	    
	    return [i[1] for i in arr[:k]]
