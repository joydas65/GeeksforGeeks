class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        //Your code here
        Stack<Integer> x = new Stack<Integer>();
        if(sizeOfStack == 1)
        return s;
        
        int val = sizeOfStack/2;
        
        int c = 1;
        
        while(c <= val){
            x.push(s.pop());
            c++;
        }
        
        s.pop();
        
        while(!x.empty()){
            s.push(x.pop());
        }
        
        return s;
    } 
}
