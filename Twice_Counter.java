class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
        HashMap<String, Integer> tw = new HashMap<String, Integer>();
        
        int temp = 0;
        
        for(String word : list){
            if(!tw.containsKey(word)){
                tw.put(word, 1);
            }else{
                temp = tw.get(word);
                tw.put(word, temp + 1);
            }
        }
        
        int ans = 0;
        
        HashSet<String> words = new HashSet<String>();
        
        for(String word : list){
            temp = tw.get(word);
            if(temp == 2 && !words.contains(word)){
                words.add(word);
                ans++;
            }
        }
        return ans;
    }
}
