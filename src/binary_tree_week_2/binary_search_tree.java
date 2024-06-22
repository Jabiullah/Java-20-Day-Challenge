package binary_tree_week_2;

public class binary_search_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data   = data;
            this.right  = null;
            this.left   = null;
        }
    }
    // *** Inorder Traversal of BST provides sorted(increasing) sequence.  (Top interview question.)

    // Time complexity is O(H). In general answer is this.
    // (***) If perfectly balance tree O(logn)

    // skewed Tree : linear tree.
    // Example :
    //               root
    //          null     data
    //                      data
    //                          data
    //                              null

    // *** BST makes search efficient.

    // **** Most problem is solved using Recursion.

    public static Node binaryTreeInsert(Node root, int val){
        // *** As it is a static method no need to object creation for calling.
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            //left sub-tree.
            root.left = binaryTreeInsert(root.left,val);

        }else{
            // right sub-tree;
            root.right = binaryTreeInsert(root.right,val);
        }
        return root;
    }
    public static String search(Node root, int key){
        if(root==null){
            return "Data is not exist.";
        }
        if(root.data == key){
            return "true";
        }else if (root.data<key){
            return search(root.right,key);
        }else {
            return search(root.left,key);
        }
    }


    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" -> ");
        inOrder(root.right);
    }
    public static String delete(Node root, int key){
        // 3 cases:
        // 1. Leaf node delete
        // 2. Single child Father delete
        // 3. Two child Father delete.                                  ***
        // Case 3 is dangerous. Replace value with inorder successor. [inorder successor always have 0/1 child.]

        return "";
    }

    public static void main(String[] args) {
        int values[] = {5,2,1,7,4,9};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = binaryTreeInsert(root,values[i]);
        }

        System.out.println();
        System.out.println("InOrder Traversal for verifying BST.");
        inOrder(root);
        System.out.print("Null\n");

        System.out.println("Is 10 available ? \nAns. "+search(root,10));
        System.out.println("Is 4 available ? \nAns. "+search(root,4));
    }
}
