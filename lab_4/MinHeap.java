public class MinHeap {
    private int[] heap;
    private int capacity;
    private int size;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity + 1]; // Index 0 is not used
        size = 0;
    }

    public void insert(int key) {
        if (size >= capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }
        size++;
        heap[size] = key;
        int index = size;
        while (index > 1 && heap[parent(index)] > heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public int removeMin() {
        if (isEmpty()) {
            System.out.println("Heap is empty. Cannot remove minimum.");
            return -1;
        }
        int min = heap[1];
        heap[1] = heap[size];
        size--;
        minHeapify(1);
        return min;
    }

    public int min() {
        if (isEmpty()) {
            System.out.println("Heap is empty. No minimum.");
            return -1;
        }
        return heap[1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void minHeapify(int index) {
        int left = leftChild(index);
        int right = rightChild(index);
        int smallest = index;
        if (left <= size && heap[left] < heap[index])
            smallest = left;
        if (right <= size && heap[right] < heap[smallest])
            smallest = right;
        if (smallest != index) {
            swap(index, smallest);
            minHeapify(smallest);
        }
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return 2 * index;
    }

    private int rightChild(int index) {
        return 2 * index + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(4);
        heap.insert(2);
        heap.insert(8);
        heap.insert(5);

        System.out.println("Min: " + heap.min()); // Should print 2

        System.out.println("Remove min: " + heap.removeMin()); // Should print 2
        System.out.println("Min: " + heap.min()); // Should print 4

        System.out.println("Size: " + heap.size()); // Should print 3
        System.out.println("Is empty: " + heap.isEmpty()); // Should print false
    }
}
