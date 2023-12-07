\\binary tree
import java.util.Scanner;
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class BinaryTree{
    Node root;
    public void traverseTree(Node node){
        if (node!=null){
            teaverseTree(node.left);
            System.out.println(" " + node.key);
            teaverseTree(node.right);

        }
    }
    public static void main (String[]args){
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.right=new Node(4);
        System.out.println("\n BinaryTree:");
        tree.teaverseTree(tree.root);
    }
}
