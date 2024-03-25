public class lab5_q7 {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(8);
        bst.insert(4);
        bst.insert(12);
        bst.insert(2);
        bst.insert(6);
        bst.insert(10);
        bst.insert(14);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);
        bst.insert(11);
        bst.insert(13);
        bst.insert(15);

        bst.inOrderTrav();

        long start = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            bst.search(1);
        }
        long end = System.nanoTime();
        long runtime1 = end - start;

        start = System.nanoTime();
        for(int i = 0; i < 1000000; i++){
            bst.search(15);
        }
        end = System.nanoTime();
        long runtime2 = end - start;

        System.out.println();
        System.out.println("Time elapsed to search for 1: "+runtime1);
        System.out.println("Time elapsed to search for 15: "+runtime2);
        
        bst.remove(8);
        bst.inOrderTrav();

        
    }
}
