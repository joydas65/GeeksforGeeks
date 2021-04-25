class Solution {
    
    List<String> ans;
    
    public void compute(String p, int open, int close) {
        if (close == 0) {
            
            ans.add(p);
                
            return;
        }
        
        if (open > 0) {
            compute(p + "(", open - 1, close);
        }
        
        if (close > 0 && close > open) {
            compute(p + ")", open, close - 1);
        }
    }
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        ans = new ArrayList<String>();
        
        compute("(", n-1, n);
        
        return ans;
    }
}
