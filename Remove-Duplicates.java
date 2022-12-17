class Solution {
    String removeDups(String S) {
        // code here
        int[] arr = new int[26]; int n = S.length();
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < n; i++) {
            arr[S.charAt(i) - 'a']++;
            if (arr[S.charAt(i) - 'a'] == 1) {
                sb.append(S.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
