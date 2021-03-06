class GfG
{
    public static boolean checkString(String str, int k)
    {
        int n = str.length(); int c = 0, a = -1, b = -1;
        
        if(n % k != 0)
        return false;
        
        HashMap<String, Integer> arr = new HashMap<String, Integer>();
        
        for(int i = 0; i <= n-k; i += k){
            String word = str.substring(i,i+k);
            //System.out.println(word);
            if(arr.containsKey(word)){
                arr.put(word, arr.get(word) + 1);
            }else{
                c += 1;
                if(c > 2)
                return false;
                arr.put(word, 1);
            }
        }
        
        if(c == 1)
        return true;
        
        for(Map.Entry m : arr.entrySet()){
            if(a == -1)
            a = (int)m.getValue();
            else if(a != -1 && b == -1)
            b = (int)m.getValue();
        }
            
        if(a == 1 || b == 1)
        return true;
        return false;
    }
}
