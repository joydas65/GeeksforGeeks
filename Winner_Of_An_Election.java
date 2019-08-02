class Election
{
    static void winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        for(String name : arr){
            if(names.containsKey(name)){
                names.put(name, names.get(name)+1);
            }else{
                names.put(name, 1);
            }
        }
        int maxVotes = 0;
        //String alphas = "abcdefghijklmnopqrstuvwxyz";
        for(Map.Entry<String, Integer> m : names.entrySet()){
            String Name = m.getKey();
            int votes = m.getValue();
            maxVotes = Math.max(maxVotes, votes);
        }
        ArrayList<String> leaders = new ArrayList<String>();
        for(Map.Entry<String, Integer> m : names.entrySet()){
            int votes = m.getValue();
            if(votes == maxVotes){
                leaders.add(m.getKey());
            }
        }
        Collections.sort(leaders);
        System.out.print(leaders.get(0)+" "+names.get(leaders.get(0)));
    }
}
