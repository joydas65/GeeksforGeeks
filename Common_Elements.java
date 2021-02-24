class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        int i=0,j=0,k=0,c=0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(i < n1 && j < n2 && k < n3){
            if(A[i] == B[j] && B[j] == C[k]){
                if(c == 0 || A[i] != arr.get(c-1)){
                    c++;
                    arr.add(A[i]);
                }
                i++;
                j++;
                k++;
            }else if(A[i] <= B[j] && A[i] <= C[k]){
                i++;
            }else if(B[j] <= A[i] && B[j] <= C[k]){
                j++;
            }else if(C[k] <= A[i] && C[k] <= B[j]){
                k++;
            }
        }
        
        return arr;
    }
}
