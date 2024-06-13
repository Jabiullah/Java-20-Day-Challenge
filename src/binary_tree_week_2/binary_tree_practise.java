package binary_tree_week_2;

public class binary_tree_practise {
    // binary tree is a bit of tough for me. So I revisited my previous two task gradually.
    // 1. Building binary tree.
    // 2. Traversal.
    // 3. Building Binary Search Tree logic (New Task for today) ***
    // 4. Total Nodes.
    // 5. Height.
    static class Node{
        int data;

        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int index =-1;

    static int count = 0;
    static class binaryTree{
        public static Node buildTree(int nums[]){

            if(index<nums.length){
                index++;
            }

            if(nums[index]==-1){ // recursive base case
                return null;
            }

            Node node = new Node(nums[index]);
            node.left = buildTree(nums);
            node.right = buildTree(nums);

            return node;
        }

        public static void preOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preOrder(root.left);
            System.out.print(root.data+" ");
            preOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }
        // ***
        // Height is the number of nodes in the longest path from root to leaf.
        // Also, this is the maximum depth of BT.
        // some say it is the edges of that longest path.
        // If there is n nodes then edge automatically n-1
        public static int getHeight(Node root){
            if (root==null){
                return 0;
            }
            int left  = getHeight(root.left);
            int right = getHeight(root.right);
            return 1+Math.max(left,right);
        }

    }


    public static void main(String[] args) {
        int nums[] = {50,2,3,4,-1,-1,-1,29,-1,-1,-1};
        binaryTree b = new binaryTree();

        Node node = b.buildTree(nums);
        System.out.print("PreOrder  : ");
        b.preOrder(node);
        System.out.println();
        System.out.print("InOrder   : ");
        b.inOrder(node);
        System.out.println();
        System.out.print("PostOrder : ");
        b.postOrder(node);
        System.out.println();
        System.out.println("Height: "+b.getHeight(node));
    }
}
