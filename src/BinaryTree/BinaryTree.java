package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.right.right = new Node(5);
        binaryTree.root.right.right.left = new Node(6);
        binaryTree.root.right.right.left.right = new Node(7);
        Node n = deepestRightMostNode(binaryTree.root);
        System.out.println(n.key);
    }

    static Scanner sc = null;
  /* public static void main(String[] args) {
       BinaryTree binaryTree = new BinaryTree();
       sc= new Scanner(System.in);
       binaryTree.root = createTree();
   }*/

    private static Node createTree() {
        Node temp = null;
        System.out.println("Enter data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        temp = new Node(data);
        System.out.println("Enter left for " + data);
        temp.left = createTree();
        System.out.println("Enter right for " + data);
        temp.right = createTree();
        return temp;
    }

    public void insert(Node temp, int key) {

        if (temp == null) {
            root = new Node(key);
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);

        while (!queue.isEmpty()) {
            temp = queue.peek();
            queue.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                queue.add(temp.left);
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                queue.add(temp.right);
        }
    }

    public static Node deepestRightMostNode(Node root) {
        if (root == null) {
            return null;
        } else if (root.right == null) {
            if (root.left == null) {
                return root;
            } else
                return deepestRightMostNode(root.left);
        } else if (root.right != null) {
            return deepestRightMostNode(root.right);
        }
        return null;
    }
    public void deleteNode(int key){
        Node deepestNode = deepestRightMostNode(root);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node keyNode = null;
        while (!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            if(temp.key==key){
                keyNode = temp;
                break;
            }
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
        }
        int x = deepestNode.key;
        deleteDeepestNode(root,deepestNode);
        keyNode.key =x ;
    }

    private void deleteDeepestNode(Node root, Node deepestNode) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            if(temp ==deepestNode){
                temp=null;
                return;
            }
            if(temp.right!=null){
               if(temp.right== deepestNode){
                temp.right = null;
               }
               else
                   queue.add(temp.right);
            }
            if(temp.left!=null){
                if(temp.left== deepestNode){
                    temp.left = null;
                }
                else
                    queue.add(temp.left);
            }
        }
    }
    public Node findInorderSuccessor(Node n){
        return null;
    }
}
