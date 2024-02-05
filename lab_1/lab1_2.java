import java.util.HashSet;
import java.util.stream.Collectors;

public class lab1_2{
    public static void main(String args[]){
        String str = "((3*(9-(4*(6-5))))";
        
        System.out.println("The string is "+(checkBalance_O_1(str)?"balanced":"unbalanced"));
    }

    public static boolean checkBalance_O_1(String str){
        StackO_1 stack = new StackO_1();
        boolean balanced = true;
        String validChars = "{,},[,],(,),0,1,2,3,4,5,6,7,8,9,+,-,*,/";
        HashSet<Character> charSet = validChars.chars().mapToObj(e -> (char) e).collect(Collectors.toCollection(HashSet::new));
        
        try {
            for(int i = 0; i < str.length(); i++){

                if(!charSet.contains(str.charAt(i))){
                    System.out.println(str.charAt(i)+" is an invalid character!");
                    return false;
                }

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
