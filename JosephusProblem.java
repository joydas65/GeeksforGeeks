class Josephus
{
   public int josephus(int n, int k)
    {
        //Your code here
        int visited[] = new int[21];
        
        Arrays.fill(visited, 0);
        
        int killCount = 0,ignore = 0,index = 0;
        
        while(killCount < (n-1)){
            ignore=0;
            index = index % n;
            while(ignore < k){
                if(visited[index%n] == 0){
                    ignore++;
                    if(ignore == k){
                        visited[index%n] = 1;
                        index++;
                        killCount++;
                        break;
                    }
                }
                index += 1;
                index = index%n;
            }
        }
        int i=0;
        for(i = 0; i < n; i++){
            if(visited[i] == 0){
                break;
            }
        }
        return i+1;
    }
}
