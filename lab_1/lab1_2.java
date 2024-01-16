public class lab1_2{
    public static void main(String args[]){
        Stack stack = new Stack();
        String str = "{3*(2+[3-[4/[6/9]]]})";
        boolean balanced = true;

        try {
            for(int i = 0; i < str.length(); i++){
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
                        if(stack.top() != '('){
                            balanced = false;
                            break;
                        }else stack.pop();
                        break;
                    case ']':
                        if(stack.top() != '['){
                            balanced = false;
                            break;
                        }else stack.pop();
                        break;
                    case '}':
                        if(stack.top() != '{'){
                            balanced = false;
                            break;
                        }else stack.pop();
                        break;
                    default:
                        break;
                }
                if(!balanced) break;
            }
        } catch (Exception e){

        }

        System.out.println("The string is "+((balanced && stack.isEmpty())?"balanced":"unbalanced"));
        
    }
}
