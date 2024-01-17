public class lab2_1 {
    public static void main(String[] args) {
        String str = "()(()()()()()())";
        System.out.println("This string is "+(checkBalance(str) ? "":"not ")+"balanced");
    }

    public static boolean checkBalance(String str) {
        Stack stack = new Stack();
        boolean balanced = true;        
        
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '(':
                    stack.push(str.charAt(i));
                    break;
                case '[':
                    stack.push(str.charAt(i));
                    break;
                case '{':
                    stack.push(str.charAt(i));
                    break;
                case ')':
                    if (stack.top() != '(') {
                        balanced = false;
                        break;
                    } else
                        try{stack.pop();}
                        catch(Exception e)
                        {return false;};
                    break;
                case ']':
                    if (stack.top() != '[') {
                        balanced = false;
                        break;
                    } else
                        stack.pop();
                    break;
                case '}':
                    if (stack.top() != '{') {
                        balanced = false;
                        break;
                    } else
                        stack.pop();
                    break;
                default:
                    break;
            }
            if (!balanced)
                break;
        }

        return balanced && stack.isEmpty();
    }

}
