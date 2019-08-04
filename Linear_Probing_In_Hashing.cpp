void linearProbing(int hash[],int hashSize,int arr[],int sizeOfArray)
{
    //Your code here
    int c = 0;
    for(int i = 0; i < sizeOfArray; i++){
        if(c >= hashSize)
        continue;
        if(hash[arr[i]%hashSize] == -1){
            hash[arr[i]%hashSize] = arr[i];
            c += 1;
        }else{
            int j = 1;
            while(hash[(arr[i]+j)%hashSize] != -1){
                j += 1;
            }
            hash[(arr[i]+j)%hashSize]=arr[i];
            c += 1;
        }
    }
}
