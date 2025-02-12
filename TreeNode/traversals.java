package TreeNode;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TreeNode{
    static Node root;
    public static void insert(int data){
        root = insertRec(root, data);
    }
    
    public static Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        } else if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        
        return root;
    }
    public static void display(){
        System.out.print("Inorder Traversal: ");
        inOrder(root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postOrder(root);
    }
    public static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}

public class traversals {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        TreeNode tree = new TreeNode();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            tree.insert(sc.nextInt());
        }
        tree.display();
    }
}