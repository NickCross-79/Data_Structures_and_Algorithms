public class lab5_q4 {
    public static void main(String[] args) {
        BST bst = new BST();

        for(int i = 1; i <= 15; i++){
            bst.insert(i);
        }

        bst.inOrderTrav();

    }
}
