class Isomorphic{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String S1,String S2)
    {
        // Your code here
        if(S1.length() != S2.length())
        return false;
        
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        Arrays.fill(arr1,0);
        Arrays.fill(arr2,0);
        for(int i = 0; i < S1.length(); i++){
            if(arr1[(int)S1.charAt(i)] == 0 && arr2[(int)S2.charAt(i)] == 0){
                arr1[(int)S1.charAt(i)] = (int)S2.charAt(i);
                arr2[(int)S2.charAt(i)] = (int)S1.charAt(i);
            }else{
                if(arr1[(int)S1.charAt(i)] != (int)S2.charAt(i) && arr2[(int)S2.charAt(i)] != (int)S1.charAt(i))
                return false;
            }
        }
        return true;
    }
}
