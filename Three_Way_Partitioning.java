class GfG
{
	public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{
        //add code here.
        ArrayList<Integer> lessThan = new ArrayList<Integer>();
        ArrayList<Integer> inRange = new ArrayList<Integer>();
        ArrayList<Integer> greaterThan = new ArrayList<Integer>();
        ArrayList<Integer> combine = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++){
            int val = A.get(i);
            if(val < a){
                lessThan.add(val);
            }else if(val >= a && val <= b){
                inRange.add(val);
            }else{
                greaterThan.add(val);
            } 
        }
        
        for(int i = 0; i < lessThan.size(); i++){
            combine.add(lessThan.get(i));
        }
        
        for(int i = 0; i < inRange.size(); i++){
            combine.add(inRange.get(i));
        }
        
        for(int i = 0; i < greaterThan.size(); i++){
            combine.add(greaterThan.get(i));
        }
        
        return combine;
    }
}
