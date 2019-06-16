int search( int n,int m, int x, int mat[SIZE][SIZE])
{
   // Your code here
   for(int i = 0; i < n; i++){
       int left = 0,right = m-1;
       while(left <= right){
           int mid = left + (right - left)/2;
           if(mat[i][mid] == x)
           return 1;
           else if(mat[i][mid] < x)
           left = mid + 1;
           else
           right = mid - 1;
       }
   }
   return 0;
}
