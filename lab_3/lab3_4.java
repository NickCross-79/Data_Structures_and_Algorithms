import java.util.concurrent.ThreadLocalRandom;

public class lab3_4 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i = 0; i < 10; i++){
            queue.enqueue(ThreadLocalRandom.current().nextInt(0,11));
        }

        mergeSort(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }

    public static void mergeSort(Queue queue) {
        if (queue.size() > 1) {
            Queue left = new Queue();
            Queue right = new Queue();
            int mid = queue.size() / 2;
            
            while (left.size() < mid) {
                left.enqueue(queue.dequeue());
            }
            while (!queue.isEmpty()) {
                right.enqueue(queue.dequeue());
            }
            
            mergeSort(left);
            mergeSort(right);
            
            merge(queue, left, right);
        }
    }

    public static void merge(Queue result, Queue left, Queue right) {
        while (!left.isEmpty() && !right.isEmpty()) {
            if ((int)left.front().object <= (int)right.front().object) {
                result.enqueue(left.dequeue());
            } else {
                result.enqueue(right.dequeue());
            }
        }
        
        while (!left.isEmpty()) {
            result.enqueue(left.dequeue());
        }
        
        while (!right.isEmpty()) {
            result.enqueue(right.dequeue());
        }
    }
}
