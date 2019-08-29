void nextLargerElement(long long arr[], int n){
    // Your code here
    stack<long long> s;
    long long ans[n];
    s.push(0);
    
    for(int i = 1; i < n; i++){
        if(s.empty()){
            s.push((long long)i);
            continue;
        }
        
        while(!s.empty() && arr[s.top()] < arr[i]){
            ans[s.top()] = arr[i];
            s.pop();
        }
        
        s.push(i);
    }
    
    while(!s.empty()){
        ans[s.top()] = -1;
        s.pop(); 
    }
    
    for(int i = 0; i < n; i++){
        cout<<ans[i]<<" ";
    }
}
