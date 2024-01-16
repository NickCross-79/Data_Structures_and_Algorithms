public class lab1_2{
    public static void main(String args[]){
        String str = "(3*(2+[3-[4/[6/9]]]))";
        long start = System.nanoTime();
        for(int i = 0; i < 100000000; i++){
            checkBalance_O_1(str);
        }
        long end = System.nanoTime();
        double o1_Time = (end - start) / 1_000_000_000;
        start = System.nanoTime();
        for(int i = 0; i < 100000000; i++){
            checkBalance_O_n(str);
        }
        end = System.nanoTime();
        double on_Time = (end - start) / 1_000_000_000;
        System.out.println("The string is "+(checkBalance_O_n(str)?"balanced":"unbalanced"));
        System.out.println(o1_Time+" seconds to run in O(1) time (100,000,000 times)");
        System.out.println(on_Time+" seconds to run in O(n) time (100,000,000 times)");
    }

    public static boolean checkBalance_O_n(String str){
        StackO_n stack = new StackO_n();
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
        return balanced && stack.isEmpty();
    }

    public static boolean checkBalance_O_1(String str){
        StackO_1 stack = new StackO_1();
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
        return balanced && stack.isEmpty();
    }
}
