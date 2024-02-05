import java.util.Arrays;
import java.util.Random;

public class lab2_6 {
    public static void main(String[] args) {
        int n = 10;

        Random rand1 = new Random();
        

        int[] a1 = new int[n];

        LinkedList l1 = new LinkedList();

        for(int i = 0; i < n; i++){
            a1[i] = rand1.nextInt(100);
        }

        Arrays.sort(a1);

        for(int i = 0; i < n; i++){
            l1.addLast(a1[i]);
        }

        print(l1.head);
    }

    public static void print(Node node){
        if(node != null){
            System.out.println(node.object);
            print(node.nextNode);
        }
        return;
    }
}
