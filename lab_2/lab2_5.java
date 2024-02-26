import java.util.Arrays;
import java.util.Random;

public class lab2_5 {
    public static void main(String[] args) {
        int n = 10;

        Random rand1 = new Random();
        Random rand2 = new Random();

        int[] a1 = new int[n];
        int[] a2 = new int[n];

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        for(int i = 0; i < n; i++){
            a1[i] = rand1.nextInt(100);
            a2[i] = rand2.nextInt(100);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i = 0; i < n; i++){
            l1.addLast(a1[i]);
            System.out.println("l1: "+l1.getLast().object);
            l2.addLast(a2[i]);
            System.out.println("l2: "+l2.getLast().object);
        }  

        long start = System.nanoTime();
        LinkedList mergedList = merge(l1.head, l2.head);
        long end = System.nanoTime();

        long time = end - start;

        
        Node node = mergedList.head;
        while(node != null){
            System.out.print(node.object+" ");
            if(node.nextNode == null)
                break;
            node = node.nextNode;
        }
        System.out.println("Time: "+time);
    }
    
    public static LinkedList merge(Node n1, Node n2){
        Queue q1 = new Queue();
        Queue q2 = new Queue();

        LinkedList merged = new LinkedList();

        while(n1 != null || n2 != null){
            if(n1 != null){
                q1.enqueue((int)n1.object);
                n1 = n1.nextNode;
            }
            if(n2 != null){
                q2.enqueue(n2.object);
                n2 = n2.nextNode;
            }
        }

        while(q1.isEmpty() != true || q2.isEmpty() != true){
            if(q1.front() == null)
                merged.addLast(q2.dequeue());
            else if(q2.front() == null)
                merged.addLast(q1.dequeue());
            else if(q1.front() != null && q2.front() != null)
                merged.addLast(((int)q1.front().object > (int)q2.front().object) ? q2.dequeue():q1.dequeue());
        }

        return merged;
    }
}
