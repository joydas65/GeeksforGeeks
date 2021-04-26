class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String ans = "";
        
        HashSet<Character> seen = new HashSet<Character>();
        
        int n = string1.length(), m = string2.length();
        
        for (int i = 0; i < m; i++) {
            char c = string2.charAt(i);
            
            seen.add(c);
        }
        
        for (int i = 0; i < n; i++) {
            if (!seen.contains(string1.charAt(i)))
            ans += string1.charAt(i);
        }
        
        return ans;
    }
}
