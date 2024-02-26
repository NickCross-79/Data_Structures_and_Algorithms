public class LinkedList {

    int numNodes = 0;
    Node head = null;
    Node tail = null;

    public void addFirst(Object obj) {
        Node newNode = new Node();
        newNode.object = obj;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        numNodes++;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.nextNode;

            if (head == null) {
                tail = null;
            }

            numNodes--;
        }
    }

    public void addLast(Object obj) {
        Node newNode = new Node();
        newNode.object = obj;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }

        numNodes++;
    }

    public void removeLast() {
        if (head != null) {
            if (head.nextNode == null) {
                head = null;
                tail = null;
            } else {
                Node currentNode = head;
                while (currentNode.nextNode.nextNode != null) {
                    currentNode = currentNode.nextNode;
                }

                currentNode.nextNode = null;
                tail = currentNode;
            }

            numNodes--;
        }
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return tail;
    }

    public int size() {
        return numNodes;
    }
}
