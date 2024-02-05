public class StackO_1 {

    char[] stack = new char[20];
    int lastIndex = 0;
    
    public void push(char item){
        int size = stack.length;
        if(stack[size-1] != '\u0000'){
            System.out.println("Stack is full!");
            return;
        }else {
            stack[lastIndex] = item;
            lastIndex++;
        }
    }

    public void pop() throws Exception{
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            throw new Exception();
        }
        else {
            stack[lastIndex-1] = '\u0000';
            lastIndex--;
        }
    }

    public char top(){
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        }
        else {
            return stack[lastIndex-1];
        }
        return '0';
    }

    public int size(){
        return lastIndex;
    }

    public boolean isEmpty(){
        return (stack[0] == '\u0000');
    }
}
