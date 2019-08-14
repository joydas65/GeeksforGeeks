class Rotation
{
    // a[][]: input matrix
    // n: size of matrix
    static void rotateby90(int mat[][], int N)
    {
        for (int x = 0; x < N / 2; x++) 
        { 

            for (int y = x; y < N-x-1; y++) 
            { 
                int temp = mat[x][y]; 
 
                mat[x][y] = mat[y][N-1-x]; 
 
                mat[y][N-1-x] = mat[N-1-x][N-1-y]; 

                mat[N-1-x][N-1-y] = mat[N-1-y][x]; 
       
                mat[N-1-y][x] = temp; 
            } 
        } 
    }
}
