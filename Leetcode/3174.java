public String clearDigits(String s) {
    if(s.length() == 0){
        return s;
    }

    Stack<Character> stack = new Stack<>();
    for(char c : s.toCharArray()){
        if(Character.isLetter(c))
            stack.push(c);
        else{
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
    }
    StringBuilder sb = new StringBuilder();
    for(Character c : stack){
        sb.append(c);
    }

    return sb.toString();
}