class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        for(int i = 0; i < tokens.length;i++)
        {
            if(tokens[i].equals("+"))
            {
                int a = stack.pop() + stack.pop();
                stack.push(a);
            }
            else if(tokens[i].equals("-"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            }
            else if(tokens[i].equals("*"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            }
            else if(tokens[i].equals("/"))
            {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else
            {
                int c = Integer.parseInt(tokens[i]);
                stack.add(c);
            }
        } 
        return stack.peek();
        
    }
}