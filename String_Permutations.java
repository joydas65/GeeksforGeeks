class Permutation
{
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    public static void compute(String s, int l, int r){
        if(l == r)
            System.out.print(s+" ");
        else{
            for(int i = l; i <= r; i++){
                s = swap(s, l, i);
                compute(s, l+1, r);
                s = swap(s, l, i);
            }
        }
    }
    
    public void permutation(String S)
    {
        //Your code here
        compute(S, 0, S.length()-1);
    }
	   
}
