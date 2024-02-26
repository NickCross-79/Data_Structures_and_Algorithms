
public class lab3_3 {
    public static void main(String[] args) {
        int[] arrr = {8,4,9,3,2,7,26,8,4,5,8,3,6,8,3,9,4,7,3,7,2,2};
        quickSort(arrr, 0, arrr.length - 1);
    
        for(int i = 0; i < arrr.length; i++){
            System.out.print(arrr[i]+" ");
        }
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }    
}
