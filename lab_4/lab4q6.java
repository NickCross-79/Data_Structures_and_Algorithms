import java.util.Random;

public class lab4q6 {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Random rand = new Random();
        for(int i = 3; i <= 20; i++){
            n = (int) Math.pow(2, i);
            arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = rand.nextInt(1000);
            }
            long start = System.nanoTime();
            HeapSort.heapSort(arr);
            long end = System.nanoTime();

            long time = end - start;
            System.out.println("n = "+n+" --- Time = "+time);
        }
        
    }
}
