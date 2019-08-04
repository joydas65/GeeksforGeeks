public static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize)
{
    //Your code here
    for(int item : arr){
        hashTable.get(item % hashSize).add(item);
    }
}
