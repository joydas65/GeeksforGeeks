import java.util.*;
class TestClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,i;
        for(int x=1;x<=t;x++){
            n = sc.nextInt();
            long arr[] = new long[n];
            for(i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            Stack<Long> st = new Stack<Long>();
            long answer_array[] = new long[n];
            answer_array[n-1] = -1;
            st.push(arr[n-1]);
            for(i = n-2; i >= 0; i--){
                if(arr[i] < st.peek()){
                    answer_array[i] = st.peek();
                }else{
                    while(!st.empty() && arr[i] >= st.peek()){
                        st.pop();
                    }
                    answer_array[i] = st.empty() ? -1 : st.peek();
                }
                st.push(arr[i]);
            }
            for(i = 0; i < n; i++){
                System.out.print(answer_array[i]+" ");
            } 
            System.out.println();
        }
    }
}
