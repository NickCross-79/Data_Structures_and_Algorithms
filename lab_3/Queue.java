public class Queue {

    LinkedList list = new LinkedList();

    public void enqueue(Object obj){
        list.addLast(obj);
    }

    public Object dequeue(){
        if(list.size() != 0){
            Object first = list.getFirst().object;
            list.removeFirst();
            return first;
        }
        return null;
    }

    public Node front(){
        return list.getFirst();
    }

    public int size(){
        return list.size();
    }

    public Boolean isEmpty(){
        return (list.size() == 0);
    }
}
