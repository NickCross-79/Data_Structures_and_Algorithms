public class BST {
    TreeNode root;

    public BST(){
        this.root = null;
    }

    public BST(int key){
        this.root = new TreeNode(key);
    }

    public void inOrderTrav(){
        System.out.println();
        inOrderTravRec(this.root);
    }

    private void inOrderTravRec(TreeNode node){
        if(node.left != null) inOrderTravRec(node.left);
        System.out.print(node.key+" ");
        if(node.right != null) inOrderTravRec(node.right);
    }

    public void insert(int key){
        TreeNode newNode = new TreeNode(key);
        this.root = insertRec(this.root, newNode);
    }

    private TreeNode insertRec(TreeNode node, TreeNode newNode){
        if(node == null) return newNode;

        else if(node.key >= newNode.key) node.left = insertRec(node.left, newNode);
        else node.right = insertRec(node.right, newNode);
        return node;
    }

    public TreeNode search(int key){
        return searchRec(this.root, key);
    }

    private TreeNode searchRec(TreeNode node, int key){
        if(node.key == key){
            return node;
        }
    if(node.key > key && node.left != null){
            return searchRec(node.left, key);
        }
        else return searchRec(node.right, key);
    }

    public void remove(int key){
        this.root = removeRec(this.root, key);
    }

    private TreeNode removeRec(TreeNode node, int key){
        if(node == null){
            return node;
        }

        if(node.key > key){
            node.left = removeRec(node.left, key);
        }
        else if(node.key < key){
            node.right = removeRec(node.right, key);
        }
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.key = minValue(node.right);
            node.right = removeRec(node.right, node.key);
        }
        return node;
    }

    public int minValue(TreeNode node){
        int minVal = node.key;
        if(node.left != null){
            return minValue(node.left);
        }
        return minVal;
    }
    
}
