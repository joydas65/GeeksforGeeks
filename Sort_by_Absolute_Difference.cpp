int val;
bool comp(int a,int b){
    if(abs(a-val) < abs(b-val))
        return true;
    return false;
}
void sortABS(int A[],int N, int k)
{
    val = k;
    stable_sort(A,A+N,comp);
   //Your code here
}
