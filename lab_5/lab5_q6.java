public class lab5_q6 {
    public static void main(String[] args) {
        BST bst = new BST();

        for(int i = 1; i <= 15; i++){
            bst.insert(i);
        }

        bst.remove(5);
        bst.inOrderTrav();
        bst.remove(15);
        bst.inOrderTrav();
        bst.remove(1);
        bst.inOrderTrav();
        bst.insert(2);
        bst.inOrderTrav();
    }
}
