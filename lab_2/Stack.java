public class Stack {

    LinkedList list = new LinkedList();
    
    public void push(char item){
        list.addLast(item);
    }

    public void pop() throws Exception{
        if(list.size() == 0) {
            System.out.println("Stack is empty! Cannot pop");
            throw new Exception();
        }
        else {
            list.removeLast();
        }
    }

    public char top(){
        if(list.size() == 0) {
            System.out.println("Stack is empty! Cannot get top");
        }
        else {
            return (char) list.getLast().object;
        }
        return '0';
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return (list.size() == 0);
    }
}
