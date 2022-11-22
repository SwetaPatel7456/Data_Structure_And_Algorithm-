package BinaryTree;

public class DiameterOfBinaryTree {
    Node root ;

    DiameterOfBinaryTree(int key){
        root = new Node(key);
    }
    DiameterOfBinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();
        diameterOfBinaryTree.root = new Node(1);
        diameterOfBinaryTree.root.left = new Node(2);
        diameterOfBinaryTree.root.right = new Node(3);
        diameterOfBinaryTree.root.left.left = new Node(4);
        System.out.println(findDiameter(diameterOfBinaryTree.root));
    }

    public static int findDiameter(Node root){
       if(root==null){
           return 0;
       }
       int d1 = findDiameter(root.left);
       int d2 = findDiameter(root.right);
       int cur = height(root.left)+height(root.right)+1;
       return Math.max(cur,Math.max(d1,d2));
    }

    public static int height(Node root) {
        if(root==null){
            return 0;
        }
        else
            return  1+ Math.max(height(root.left),height(root.right));
    }
}
