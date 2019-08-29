int getId(int M[MAX][MAX], int n)
{
    //Your code here
    int i,j;
    int c=0,ans=0;
    for(i = 0; i < n; i++){
        for(j = 0; j < n; j++){
            if(i != j && M[i][j] == 1)
            break;
        }
        if(j == n){
            for(j = 0; j < n; j++){
                if(i != j && M[j][i] == 0)
                break;
            }
            if(j == n){
                c++;
                ans = i;
            }
        }
    }
    
    return c == 1 ? ans : -1;
}
