public static boolean check(int n, int f){
    return f >= n ? true : false;
}
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    HashMap<Character, ArrayList<Integer>> d = new HashMap<Character, ArrayList<Integer>>();
	    
	    int n = pattern.length(); char c;
	    
	    ArrayList<Integer> temp;
	    
	    for(int i = 0; i < n; i++){
	        c = pattern.charAt(i);
	        if(!d.containsKey(c)){
	            temp = new ArrayList<Integer>();
	            temp.add(i);
	            d.put(c, temp);
	        }
	        else{
	            temp = d.get(c);
	            temp.add(i);
	            d.put(c, temp);
	        }
	    }
	    
	    ArrayList<String> ans = new ArrayList<String>();
	    
	    for(int i = 0; i < dict.size(); i++){
	        String word = dict.get(i);
	        int word_len = word.length(); int flag = 0;
	        for(Map.Entry mapElement : d.entrySet()){
	            ArrayList<Integer> indices = (ArrayList<Integer>)mapElement.getValue();
	            for(int j = 1; j < indices.size(); j++){
	                
	                if(check(word_len, indices.get(j)) || check(word_len, indices.get(j-1)) || word.charAt(indices.get(j)) != word.charAt(indices.get(j-1))){
	                    flag = 1;
	                    break;
	                }
	            }
	            
	            if(flag == 1)
	            break;
	        }
	        
	        if(word_len == n && flag == 0)
	        ans.add(word);
	    }
	    
	    return ans;
	}
}
