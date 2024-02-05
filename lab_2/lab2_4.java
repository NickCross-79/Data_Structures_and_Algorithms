import java.util.Arrays;
import java.util.Random;

public class lab2_4{
    public static void main(String[] args) {
        int n = 10;

        Random rand1 = new Random();
        Random rand2 = new Random();

        int[] a1 = new int[n];
        int[] a2 = new int[n];

        for(int i = 0; i < n; i++){
            a1[i] = rand1.nextInt(100);
            a2[i] = rand2.nextInt(100);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        int[] a = {2,4,6,8,10};
        int[] b = {1,3,5,7,9};
        Queue qA = new Queue();
        Queue qB = new Queue();
        Queue sorted = new Queue();
        
        for(int i = 0; i < a.length; i++){
            qA.enqueue(a[i]);
            //System.out.println(qA.front());
        }

        for(int i = 0; i < b.length; i++){
            qB.enqueue(b[i]);
        }

        while(qA.isEmpty() == false || qB.isEmpty() == false){
            
            if(qA.front() != null && qB.front() != null){
                sorted.enqueue((int)qA.front().object < (int)qB.front().object ? qA.dequeue() : qB.dequeue());
            }

            else if(qA.isEmpty() == false){
                sorted.enqueue(qA.dequeue());
            }
            else if(qB.isEmpty() == false){
                sorted.enqueue(qB.dequeue());
            }
        }

        while(sorted.isEmpty() == false){
            System.out.println(sorted.dequeue());
        }
    }
}