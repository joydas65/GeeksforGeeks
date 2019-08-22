string removePair(string str){
    // Your code here
    
    int n = str.length();
    char characters[n];
    int top = -1;
    for(int i = 0; i < n; i++){
        if(top == -1)
        characters[++top] = str[i];
        else{
            if(characters[top] == str[i])
            top -= 1;
            else
            characters[++top] = str[i];
        }
    }
    string ans = "";
    
    for(int i = 0; i <= top; i++){
        ans += characters[i];
    }
    return ans;
}
