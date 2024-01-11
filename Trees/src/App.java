public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Trees");
        // Refer https://www.geeksforgeeks.org/tree-data-structure/
        // Traversal 
        // 1. Inorder traversal (Left, Node, Right) 
        // 2. Pre traversal (Node, Left, Right)
        // 3. Post traversal (Left, Right, Node)

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Perform inorder traversal and print the result
        System.out.println("Inorder Traversal of the Binary Tree:");
        tree.inorderTraversal();
        System.out.println();

        // Perform preorder traversal and print the result
        System.out.println("Preorder Traversal of the Binary Tree:");
        tree.preorderTraversal();
        System.out.println();

        // Perform postorder traversal and print the result
        System.out.println("Postorder Traversal of the Binary Tree:");
        tree.postorderTraversal();
        System.out.println();

        // Count size of tree and print the result
        System.out.println("Size of the Binary Tree:");
        tree.sizeInorder();

        // Compute Sum of tree and print the result
        System.out.println("Sum of the Binary Tree: ");
        System.out.println(tree.sum());

        // Compute Max of tree and print the result
        System.out.println("Max of the Binary Tree: ");
        System.out.println(tree.max());
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to initialize a node with given data
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;
    int size;
    int max;

    // Constructor to initialize an empty binary tree
    public BinaryTree() {
        this.root = null;
        this.size = 0;
        this.max = Integer.MIN_VALUE;
    }

    // Method to perform inorder traversal of the binary tree
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            // Traverse the left subtree
            inorderTraversal(node.left);

            // Visit the current node
            System.out.print(node.data + " ");

            // Traverse the right subtree
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            // Visit the current node
            System.out.print(node.data + " ");

            // Traverse the left subtree
            preorderTraversal(node.left);


            // Traverse the right subtree
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            // Traverse the left subtree
            postorderTraversal(node.left);

            
            // Traverse the right subtree
            postorderTraversal(node.right);

            // Visit the current node
            System.out.print(node.data + " ");
        }
    }

    public int sizeInorder(TreeNode node){
        if(node!=null){
            // Traverse the left subtree
            sizeInorder(node.left);

            // Visit the current node
            this.size++;

            // Traverse the right subtree
            sizeInorder(node.right);
        }
        return this.size;
    }

    public int sum(TreeNode node){
        if(node==null){
            return 0;
        }
        return sum(node.left)+node.data+sum(node.right);
    }

    public int max(TreeNode node){
        if(node==null){
            return this.max;
        }
        this.max = Math.max(Math.max(max(node.left), max(node.right)),node.data);
        return this.max;
    }

    // Method to start the inorder traversal from the root
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    // Method to start the preorder traversal from the root
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    // Method to start the postorder traversal from the root
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    // Method to start the sizeInorder traversal from the root
    public void sizeInorder(){
        System.out.println(sizeInorder(root));
    }

    public int sum(){
        return sum(root);
    }

    public int max(){
        return max(root);
    }
}

