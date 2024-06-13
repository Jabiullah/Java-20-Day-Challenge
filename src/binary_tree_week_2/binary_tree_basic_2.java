package binary_tree_week_2;

public class binary_tree_basic_2 {
    // 1. number of total node

    // 2. number of leaf using formula
    // 3. number of depth using formula
    // 4. number of height using formula
    static class Node{
        int data;

        Node left;
        Node right;
        Node(int data){
            this.data   = data;
            this.right  = null;
            this.left   = null;
        }
    }


    static class binaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){

            if(index<nodes.length-1){
                index++;
            }
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);  // he is our root

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        // 1.
        static int count=0;
        public static int getTotalNode(Node root){
            if(root==null){
                return 0;
            }
            getTotalNode(root.left);
            getTotalNode(root.right);

            count++;

            return count;
        }
        public static int getHeight(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return 1 + Math.max(leftHeight, rightHeight); //
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,-1,-1,-1,50,-1,-1,-1};

        binaryTree bt = new binaryTree();
        Node root = bt.buildTree(arr);
        int nodes = bt.getTotalNode(root);
        System.out.println("Total nodes : "+nodes);
        System.out.println("Number of leaf node : "+(nodes+1)/2);

        int height = bt.getHeight(root);
        System.out.println("Height of tree : "+height);

    }
}
