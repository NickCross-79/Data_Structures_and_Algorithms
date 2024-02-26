
public class lab3_2 {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int currentElement = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = currentElement;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {6,4,7,9,7,5,4,3,9,3,8,8,4,9,5,7,9,3,0,5};
        
        insertionSort(array);
        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
