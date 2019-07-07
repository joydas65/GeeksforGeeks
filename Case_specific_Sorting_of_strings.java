class solve{
    public static String caseSort(String str){
        // Your code here
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        //System.out.println(str);
        ArrayList<Character> small = new ArrayList<Character>();
        ArrayList<Character> large = new ArrayList<Character>();
        for(int i = 65; i <= 90; i++){
            for(int j = 0; j < n; j++){
                char c = str.charAt(j);
                if(c == (char)i)
                large.add(c);
            }
        }
        for(int i = 97; i <= 122; i++){
            for(int j = 0; j < n; j++){
                char c = str.charAt(j);
                if(c == (char)i)
                small.add(c);
            }
        }
        int x1=0,x2=0;
        //System.out.println(small.size()+" "+large.size());
        /*for(char c : small){
            System.out.println(c);
        }*/
        for(int i = 0; i < n; i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                sb.append(large.get(x2));
                x2++;
            }else if(c >= 'a' && c <= 'z'){
                sb.append(small.get(x1));
                x1++;
            }
        }
        //System.out.println(x1+" "+x2+" "+n);
        //System.out.println(sb.toString());
        return sb.toString();
    }
}
