for _ in range(int(input())):
    
    s = input()
    
    list_of_words = s.split('.')
    
    output_list = []
    
    for i in range(len(list_of_words)-1,-1,-1):
        
        output_list.append(list_of_words[i])
        
    for i in range(len(output_list)):
        
        if i == len(output_list) - 1:
            
            print(output_list[i])
            
        else:
        
            print(output_list[i],end = ".")
