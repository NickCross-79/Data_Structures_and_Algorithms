public class lab5_q5 {
    public static void main(String[] args) {
        BST bst = new BST();

        for(int i = 1; i <= 15; i++){
            bst.insert(i);
        }

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

        System.out.println("Time elapsed to search for 1: "+runtime1);
        System.out.println("Time elapsed to search for 15: "+runtime2);
        

    }
}
