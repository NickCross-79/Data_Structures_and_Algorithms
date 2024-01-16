
public class Stack {

    char[] stack = new char[20];
    
    public void push(char item){
        int size = stack.length;
        if(stack[size-1] != 0){
            System.out.println("Stack is full!");
            return;
        }

        for(int i = 0; i < size; i++){
            if(stack[i] == 0){
                stack[i] = item;
                return;
            }
        }
    }

    public void pop() throws Exception{
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            throw new Exception();
        }
        else {
            int size = stack.length;
            for(int i = 0; i < size; i++ ){
                if(stack[i] == 0){
                    stack[i-1] = 0;
                }
            }
        }
    }

    public char top(){
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        }
        else {
            int size = stack.length;
            for(int i = 0; i < size; i++ ){
                if(stack[i] == 0 || i == size-1){
                    return stack[i-1];
                }
            }
        }
        return '0';
    }

    public int size(){
        for(int i = 0; i < stack.length; i++){
            if(stack[i] == 0) return i;
        }
        return 0;
    }

    public boolean isEmpty(){
        return (stack[0] == 0);
    }
}
