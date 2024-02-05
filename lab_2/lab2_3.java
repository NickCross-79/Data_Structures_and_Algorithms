import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str = "()(()()()()()())";
        String str = s.nextLine();
        s.close();
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
