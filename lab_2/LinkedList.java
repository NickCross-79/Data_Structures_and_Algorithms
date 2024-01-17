public class LinkedList{

    int numNodes = 0;
    Node head;
    Node tail = head;

    public void addFirst(Object obj){
        Node newNode = new Node();
        newNode.object = obj;
        if(head == null){
            head = newNode;
            numNodes++;
            return;
        }
        newNode.nextNode = head;
        head = newNode;
        numNodes++;
        return;
    }

    public void removeFirst(){
        head = head.nextNode;
        numNodes--;
        return;
    }

    public void addLast(Object obj){
        Node newNode = new Node();
        newNode.object = obj;

        if(numNodes == 0){
            head = newNode;
            tail = newNode;
            numNodes++;
            return;
        }
        tail.nextNode = newNode;
        tail = newNode;
        numNodes++;
        return;
    }

    public void removeLast(){
        Node currentNode = head;

        if(head.nextNode == null){
            head = null;
            tail = head;
            numNodes--;
            return;
        }

        while(currentNode.nextNode.nextNode != null){
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = null;
        tail = currentNode;
        numNodes--;
        return;
    }

    public Node getFirst(){
        return (numNodes > 0 ? head : null);
    }

    public Node getLast(){
        return (numNodes > 0 ? tail : null);
    }

    public int size(){
        return numNodes;
    }
}