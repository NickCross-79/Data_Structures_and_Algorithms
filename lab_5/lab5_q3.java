import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class lab5_q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(51);
        System.out.println(num);
        BST bst = new BST(num);
        for(int i = 0; i < 12; i++){
            num = rand.nextInt(51);
            System.out.println(num);
            bst.insert(num);
        }
        System.out.println("------------------");
        bst.inOrderTrav();
        System.out.println("------------------");
        visualizeTree(bst.root, 0);
    }

    private static void visualizeTree(TreeNode root, int space) {
        if (root == null)
            return;

        final int COUNT = 5;
        space += COUNT;

        visualizeTree(root.right, space);

        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.key + "\n");

        visualizeTree(root.left, space);
    }
    

    public static int findHeight(TreeNode node){
        int heightSum = 1;
        int leftSum = 0;
        int rightSum = 0;
        if(node.left != null){
            leftSum += findHeight(node.left);
        }
        if(node.right != null){
            rightSum += findHeight(node.right);
        }
        heightSum += leftSum > rightSum ? leftSum : rightSum;
        return heightSum;
    }
}
