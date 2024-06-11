package binary_tree_week_2;

import java.util.LinkedList;
import java.util.Queue;

public class binary_tree_basic {
    // Binary tree: at max 2 children
    // (***) ancestors:
    // levels and height.

    // build a tree in PreOrder.
    // usually -1 represents null
    // And we will be adding element of root left side.
    // [1,2,3,4,-1,-1,-1,50,-1]
    //          1  ---> (root)
    //        2   -1
    //      3   50
    //    4 -1
    //  -1 -1

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
    static class BinaryTree{
        static int index =-1;
        public static Node buildTree(int nodes[]) {

            // check the boundary of index increment
            if (index < nodes.length-1) {
                index++;
            }

            if(nodes[index]==-1){ // nodes array element if -1 then it is null returning
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes); // recursive
            newNode.right = buildTree(nodes);

            return newNode;
        }
        // Traversal (recursive way)
        // Preorder (root-left-right)
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

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currentNode = q.remove();
                if(currentNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{

                    System.out.print(currentNode.data+" ");

                    if(currentNode.left!=null){
                        q.add(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        q.add(currentNode.right);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,-1,-1,-1,50,-1,-1,-1};
        BinaryTree binaryTree = new BinaryTree();

        Node root = binaryTree.buildTree(nums);
        System.out.println("Root data: "+root.data);
//        System.out.println("Root left: "+root.left.data);
//        System.out.println("Root left->left: "+root.left.left.data);
//        System.out.println("Root left->right: "+root.left.right.data);
        System.out.println("Preorder Calling");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println("Inorder Calling");
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println("Postorder Calling");
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println("BFS -> Level Order Traversal && other Traversal we can say DFS");

        binaryTree.levelOrder(root);
    }
}
