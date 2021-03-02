class PrintString{
    
    // Function to find the character in patt which is present in str at min index
    public static StringBuffer printMinIndexChar(String str, String patt){
        
        // Your code here
        
        // you don't need to print anything
        HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        
        int n = str.length(), m = patt.length(), mn = Integer.MAX_VALUE;
        
        char c;
        
        for(int i = 0; i < n; i++){
            c = str.charAt(i);
            if(!seen.containsKey(c))
            seen.put(c, i);
        }
        
        String ans = "";
        
        for(int i = 0; i < m; i++){
            c = patt.charAt(i);
            if(seen.containsKey(c) && mn > seen.get(c)){
                mn = seen.get(c);
                ans = "";
                ans += c;
            }
        }
        if(ans == "")
        return new StringBuffer("$");
        return new StringBuffer(ans);
    }
}
