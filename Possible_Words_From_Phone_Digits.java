class PhoneDigit
{
    
    public void compute(int a[], int n, int index, String str, HashMap<Integer, String> d){
        if(index == n-1){
            String x = d.get(a[index]);
            for(int i = 0; i < x.length(); i++){
                System.out.print(str+x.charAt(i)+" ");
            }
        }else{
            String x = d.get(a[index]);
            for(int i = 0; i < x.length(); i++){
                compute(a, n, index + 1, str+x.charAt(i), d);
            }
        }
    }
    
    static void possibleWords(int a[], int N)
    {
        // your code here
        HashMap<Integer, String> d = new HashMap<Integer, String>();
        d.put(2, "abc");
        d.put(3, "def");
        d.put(4, "ghi");
        d.put(5, "jkl");
        d.put(6, "mno");
        d.put(7, "pqrs");
        d.put(8, "tuv");
        d.put(9, "wxyz");
        new PhoneDigit().compute(a, a.length, 0, "", d);
    }
}
