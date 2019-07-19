class LexSort
{
    static ArrayList<String> arr;
    public static void findPowerSet(String str, int index, String curr, int n){
        if(index == n)
        return;
        
        arr.add(curr);
        
        for (int i = index + 1; i < n; i++)  {
            curr += str.charAt(i); 
            findPowerSet(str, i, curr, n);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
    
    
    // complete the function
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        arr = new ArrayList<String>();
        
        findPowerSet(s,-1,"",s.length());
        
        return arr;
    }
}
 
